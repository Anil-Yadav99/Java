package collection;

import java.util.LinkedList;

public class LinkedListSpecialMethod {

	public static void main(String[] args) {
	
		LinkedList l=new LinkedList();
		
		l.add('A');
		l.add('B');
		l.add('C');
		
		System.out.println(l);
		
		l.addFirst('Z');
		l.addLast('A');
		System.out.println(l);
		
		l.removeFirst();
		l.removeLast();
		System.out.println(l);

		System.out.println(l.getFirst());
		System.out.println(l.getLast());
	}

}
