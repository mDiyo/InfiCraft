package inficraft.microblocks.core.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import com.google.common.base.Joiner;

import cpw.mods.fml.relauncher.IClassTransformer;

public class MultiInterfaceClassTransformer implements IClassTransformer {

	private boolean interfaceExists(String name) {
		try {
			getClass().getClassLoader().loadClass(name);
			return true;
		} catch(ClassNotFoundException e) {
			return false;
		}
	}
	
	// class name -> new superclass (both in internal form with /'s)
	private Map<String, String> alteredSuperclasses = new HashMap<String, String>();
	
	private static <T> T getAnnotationValue(AnnotationNode node, String key) {
		for(int k = 0; k < node.values.size(); k += 2) {
			if(((String)node.values.get(k)).equals(key))
				return (T)node.values.get(k + 1);
		}
		
		throw new IllegalArgumentException("Key "+key+" not found in annotation node (type "+node.desc+")");
	}

	@Override
	public byte[] transform(String className, byte[] bytes) {
		// ignore base classes and forge classes
		if(!className.contains(".") || className.startsWith("net.minecraft"))
			return bytes;
		
		// ignore nonexistent classes
		if(bytes == null)
			return null;
		
		ClassNode cn = new ClassNode(Opcodes.ASM4);
		new ClassReader(bytes).accept(cn, 0);
		
		AnnotationNode miAnnotation = null;
		
		if(cn.visibleAnnotations != null)
			for(AnnotationNode n : (List<AnnotationNode>)cn.visibleAnnotations)
				if(n.desc.equals("Linficraft/microblocks/core/api/MultiInterfaceClass;"))
					miAnnotation = n;
		if(cn.invisibleAnnotations != null)
			for(AnnotationNode n : (List<AnnotationNode>)cn.invisibleAnnotations)
				if(n.desc.equals("Linficraft/microblocks/core/api/MultiInterfaceClass;"))
					miAnnotation = n;
		
		if(miAnnotation != null) {
			List<AnnotationNode> interfaces = getAnnotationValue(miAnnotation, "interfaces");
			String base = getAnnotationValue(miAnnotation, "base");
			
			List<String> inheritanceChain = new ArrayList<String>();
			
			inheritanceChain.add(cn.name);
			
			for(AnnotationNode i : interfaces) {
				String impl = getAnnotationValue(i, "impl");
				String check = getAnnotationValue(i, "check");
				
				if(interfaceExists(check))
					inheritanceChain.add(impl.replace('.','/'));
			}
			
			inheritanceChain.add(base.replace('.','/'));
			
			System.out.println("[Immibis Core] Creating multi-interface inheritance chain: "+Joiner.on(" extends ").join(inheritanceChain));
			
			for(int k = 0; k < inheritanceChain.size() - 1; k++) {
				alteredSuperclasses.put(inheritanceChain.get(k), inheritanceChain.get(k + 1));
			}
			
			
		}
		
		String oldSuper = cn.superName;
		
		if(alteredSuperclasses.containsKey(cn.name))
			cn.superName = alteredSuperclasses.get(cn.name);
		else
			return bytes;
		
		for(MethodNode mn : (List<MethodNode>)cn.methods) {
			InsnList insns = mn.instructions;
			ListIterator<AbstractInsnNode> it = mn.instructions.iterator();
			while(it.hasNext()) {
				AbstractInsnNode i = it.next();
				if(i instanceof MethodInsnNode) {
					MethodInsnNode min = (MethodInsnNode)i;
					if(min.owner.equals(oldSuper))
						min.owner = cn.superName;
				}
			}
		}
		
		ClassWriter cw = new ClassWriter(0);
		cn.accept(cw);
		return cw.toByteArray();
	}
}
