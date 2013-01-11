package inficraft.microblocks.core.multipart;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;





public class SynchronizedWeakIdentityListMap<K, V> {
	
	private ReferenceQueue<K> refQueue = new ReferenceQueue<K>();
	
	private static class ListNode<K, V> {
		public WeakReference<K> key;
		public V value;
		public ListNode<K, V> next = null;
	}
	
	private ListNode<K, V> head = null;

	public synchronized void remove(K key) {
		removeCollectedKeys();
		
		if(head == null) return;
		if(head.key.get() == key) {
			head = head.next;
			return;
		}
		ListNode<K, V> cur = head;
		while(cur.next != null) {
			if(cur.next.key.get() == key) {
				cur.next = cur.next.next;
				return;
			}
			cur = cur.next;
		}
	}

	public synchronized V get(K key) {
		removeCollectedKeys();
		
		ListNode<K, V> cur = head;
		while(cur != null) {
			if(cur.key.get() == key)
				return cur.value;
			cur = cur.next;
		}
		return null;
	}

	public synchronized void put(K key, V val) {
		removeCollectedKeys();
		
		ListNode<K, V> cur = head;
		while(cur != null) {
			if(cur.key == key) {
				cur.value = val;
				return;
			}
			cur = cur.next;
		}
		ListNode<K, V> n = new ListNode<K, V>();
		n.key = new WeakReference<K>(key, refQueue);
		n.value = val;
		n.next = head;
		head = n;
	}
	
	private void removeCollectedKeys() {
		Reference<? extends K> ref;
		while((ref = refQueue.poll()) != null) {
			if(head != null && head.key == ref) {
				head = head.next;
				continue;
			}
			ListNode<K, V> cur = head;
			while(cur.next != null) {
				if(cur.next.key == ref) {
					cur.next.next = cur.next;
					break;
				}
			}
		}
	}

}
