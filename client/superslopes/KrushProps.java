package net.minecraft.src.superslopes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class KrushProps
{
  private String fileName;
  private List<String> lines = new ArrayList();
  private Map<String, String> props = new HashMap();

  public KrushProps(String fName) {
    this.fileName = fName;
    File file = new File(this.fileName);

    if (file.exists())
      try {
        load();
      } catch (IOException ex) {
        System.out.println("[Props] Unable to load " + this.fileName + "!");
      }
    else save(); 
  }

  public void load()
    throws IOException
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(this.fileName), "UTF8"));

    this.lines.clear();
    this.props.clear();
    String line;
    while ((line = reader.readLine()) != null) {
      line = new String(line.getBytes(), "UTF-8");
      char c = '\000';
      int pos = 0;

      while ((pos < line.length()) && (Character.isWhitespace(c = line.charAt(pos)))) pos++;

      if ((line.length() - pos == 0) || (line.charAt(pos) == '#') || (line.charAt(pos) == '!')) {
        this.lines.add(line);
      }
      else
      {
        int start = pos;
        boolean needsEscape = line.indexOf('\\', pos) != -1;
        StringBuffer key = needsEscape ? new StringBuffer() : null;

        if (key != null) while (true) {
            if ((pos >= line.length()) || (Character.isWhitespace(c = line.charAt(pos++))) || (c == '=') || (c == ':')) break; if ((needsEscape) && (c == '\\')) {
              if (pos == line.length()) {
                line = reader.readLine();
                if (line == null) line = "";
                pos = 0;

                pos++; if (pos < line.length()) {
                  if (Character.isWhitespace(c = line.charAt(pos))) break; continue;
                }
              }
              c = line.charAt(pos++); continue;
            }
            switch (c) {
            case 'n':
              key.append('\n');
              break;
            case 't':
              key.append('\t');
              break;
            case 'r':
              key.append('\r');
              break;
            case 'u':
              if (pos + 4 > line.length()) continue;
              char uni = (char)Integer.parseInt(line.substring(pos, pos + 4), 16);
              key.append(uni);
              pos += 4;
              break;
            case 'o':
            case 'p':
            case 'q':
            case 's':
            default:
              key.append('\000');
            }

          }


        boolean isDelim = (c == ':') || (c == '=');
        String keyString;        
        if (needsEscape) { keyString = key.toString();
        }
        else
        {          
          if ((isDelim) || (Character.isWhitespace(c)))
            keyString = line.substring(start, pos - 1);
          else {
            keyString = line.substring(start, pos);
          }
        }
        while ((pos < line.length()) && (Character.isWhitespace(c = line.charAt(pos)))) pos++;

        if ((!isDelim) && ((c == ':') || (c == '='))) {
          pos++;
          while ((pos < line.length()) && (Character.isWhitespace(c = line.charAt(pos)))) pos++;
        }

        if (!needsEscape) {
          this.lines.add(line);
        }
        else
        {
          StringBuilder element = new StringBuilder(line.length() - pos);
          while (pos < line.length()) {
            c = line.charAt(pos++);
            if (c == '\\') {
              if (pos == line.length()) {
                line = reader.readLine();

                if (line == null) break;
                pos = 0;

                while ((pos < line.length()) && (Character.isWhitespace(c = line.charAt(pos)))) pos++;
                element.ensureCapacity(line.length() - pos + element.length());
                continue;
              }
              c = line.charAt(pos++);
              switch (c) {
              case 'n':
                element.append('\n');
                break;
              case 't':
                element.append('\t');
                break;
              case 'r':
                element.append('\r');
                break;
              case 'u':
                if (pos + 4 > line.length()) continue;
                char uni = (char)Integer.parseInt(line.substring(pos, pos + 4), 16);
                element.append(uni);
                pos += 4;
                break;
              case 'o':
              case 'p':
              case 'q':
              case 's':
              default:
                element.append('\000');
              }
            }

            element.append('\000');
          }
          this.lines.add(keyString + "=" + element.toString());
        }
      }
    }
    reader.close();
  }

  public void save()
  {
    OutputStream os = null;
    try {
      os = new FileOutputStream(this.fileName);
    } catch (FileNotFoundException ex) {
      System.out.println("[Props] Unable to open " + this.fileName + "!");
    }

    PrintStream ps = null;
    try {
      ps = new PrintStream(os, true, "UTF-8");
    } catch (UnsupportedEncodingException ex) {
      System.out.println("[Props] Unable to write to " + this.fileName + "!");
    }

    List usedProps = new ArrayList();

    for (String line : this.lines) {
      if (line.trim().length() == 0) {
        ps.println(line);
      }
      else if (line.charAt(0) == '#') {
        ps.println(line);
      }
      else if (line.contains("=")) {
        int delimPosition = line.indexOf('=');
        String key = line.substring(0, delimPosition).trim();

        if (this.props.containsKey(key)) {
          String value = (String)this.props.get(key);
          ps.println(key + "=" + value);
          usedProps.add(key); } else {
          ps.println(line);
        }
      } else {
        ps.println(line);
      }
    }
    for (Map.Entry entry : this.props.entrySet()) {
      if (!usedProps.contains(entry.getKey())) {
        ps.println((String)entry.getKey() + "=" + (String)entry.getValue());
      }
    }

    ps.close();
    try {
      this.props.clear();
      this.lines.clear();
      load();
    } catch (IOException ex) {
      System.out.println("[Props] Unable to load " + this.fileName + "!");
    }
  }

  public Map<String, String> returnMap() throws Exception
  {
    Map map = new HashMap();
    BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
    String line;
    while ((line = reader.readLine()) != null)
    {
      if ((line.trim().length() != 0) && (line.charAt(0) != '#') && (line.contains("="))) {
        int delimPosition = line.indexOf('=');
        String key = line.substring(0, delimPosition).trim();
        String value = line.substring(delimPosition + 1).trim();
        map.put(key, value);
      }
    }
    reader.close();
    return map;
  }

  public boolean containsKey(String var) {
    for (String line : this.lines)
      if ((line.trim().length() != 0) && (line.charAt(0) != '#') && (line.contains("="))) {
        int delimPosition = line.indexOf('=');

        String key = line.substring(0, delimPosition);
        if (key.equals(var)) return true;
      }
    return false;
  }

  public String getProperty(String var) {
    for (String line : this.lines)
      if ((line.trim().length() != 0) && (line.charAt(0) != '#') && (line.contains("="))) {
        int delimPosition = line.indexOf('=');
        String key = line.substring(0, delimPosition).trim();
        String value = line.substring(delimPosition + 1);

        if (key.equals(var)) return value;
      }
    return "";
  }

  public void removeKey(String var) {
    Boolean changed = Boolean.valueOf(false);

    if (this.props.containsKey(var)) {
      this.props.remove(var);
      changed = Boolean.valueOf(true);
    }
    try {
      for (int i = 0; i < this.lines.size(); i++) {
        String line = (String)this.lines.get(i);

        if ((line.trim().length() == 0) || (line.charAt(0) == '#') || (!line.contains("="))) {
          continue;
        }
        int delimPosition = line.indexOf('=');
        String key = line.substring(0, delimPosition).trim();

        if (key.equals(var)) {
          this.lines.remove(i);
          changed = Boolean.valueOf(true);
        }
      }
    }
    catch (ConcurrentModificationException concEx)
    {
      removeKey(var);
      return;
    }

    if (changed.booleanValue()) save(); 
  }

  public boolean keyExists(String key)
  {
    try
    {
      return containsKey(key); } catch (Exception localException) {
    }
    return false;
  }

  public String getString(String key) {
    if (containsKey(key)) return getProperty(key);
    return "";
  }

  public String getString(String key, String value) {
    if (containsKey(key)) return getProperty(key);
    setString(key, value);
    return value;
  }

  public void setString(String key, String value) {
    this.props.put(key, value);
    save();
  }

  public int getInt(String key) {
    if (containsKey(key)) return Integer.parseInt(getProperty(key));
    return 0;
  }

  public int getInt(String key, int value) {
    if (containsKey(key)) return Integer.parseInt(getProperty(key));
    setInt(key, value);
    return value;
  }

  public void setInt(String key, int value) {
    this.props.put(key, String.valueOf(value));
    save();
  }

  public double getDouble(String key) {
    if (containsKey(key)) return Double.parseDouble(getProperty(key));
    return 0.0D;
  }

  public double getDouble(String key, double value) {
    if (containsKey(key)) return Double.parseDouble(getProperty(key));
    setDouble(key, value);
    return value;
  }

  public void setDouble(String key, double value) {
    this.props.put(key, String.valueOf(value));
    save();
  }

  public long getLong(String key) {
    if (containsKey(key)) return Long.parseLong(getProperty(key));
    return 0L;
  }

  public long getLong(String key, long value) {
    if (containsKey(key)) return Long.parseLong(getProperty(key));
    setLong(key, value);
    return value;
  }

  public void setLong(String key, long value) {
    this.props.put(key, String.valueOf(value));
    save();
  }

  public boolean getBoolean(String key) {
    if (containsKey(key)) return Boolean.parseBoolean(getProperty(key));
    return false;
  }

  public boolean getBoolean(String key, boolean value) {
    if (containsKey(key)) return Boolean.parseBoolean(getProperty(key));
    setBoolean(key, value);
    return value;
  }

  public void setBoolean(String key, boolean value) {
    this.props.put(key, String.valueOf(value));
    save();
  }
}