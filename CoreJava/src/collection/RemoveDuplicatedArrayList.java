package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDuplicatedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arr=new ArrayList();
		
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(5);
		arr.add(3);
		
		LinkedHashSet h=new LinkedHashSet(arr);
	
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
