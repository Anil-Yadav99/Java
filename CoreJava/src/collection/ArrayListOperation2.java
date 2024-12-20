package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		
		ArrayList al1=new ArrayList();
		//addAll()
		al1.addAll(al);
		//removeAll()
		al1.removeAll(al);
		//System.out.println(al1);
		
		// sort the array --Collections.sort()
		
		System.out.println("Elements:"+al);
		Collections.sort(al);
		System.out.println("After sorting");
		System.out.println("Elements"+al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("After Reverse sorting");
        System.out.println("Element:"+al);
        
        //suffling ... Collections.suffle()
        
        Collections.shuffle(al);
        System.out.println("After Shuffling");
        System.out.println("Elements"+al);
		

	}

}
