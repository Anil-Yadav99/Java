package collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListOperation2 {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		l.add('A');
		l.add('C');
		l.add('D');
		l.add('F');
		l.add('X');
		l.add('Y');
		l.add('Z');
		
		LinkedList l1=new LinkedList();
		l1.addAll(l);
		System.out.println(l1);
        l1.removeAll(l1);
        System.out.println(l1);
        
        //sort()
        Collections.sort(l);
        System.out.println(l);
        
        //sort reverse
        
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);
        
        
        //Shuffle()
        
        Collections.shuffle(l);
        System.out.println(l);
	}

}
