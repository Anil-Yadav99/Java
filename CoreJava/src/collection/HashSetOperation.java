package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		//HashSet hs=new HashSet(100,(float)0.50) // Size and Load Factor/Fill Ratio
		//HashSet hs=new HashSet(100) // Initial capacity
		
		hs.add('A');
		hs.add(1);
		hs.add("Anil");
		hs.add(0.10);
		hs.add(0.10);
		hs.add(true);
		
		System.out.println(hs);
		
		hs.remove(0.10);
		
		System.out.println(hs);
		
		System.out.println(hs.isEmpty()); //false
		
		System.out.println(hs.contains("Anil"));  //true
		
//		hs.removeAll(hs);
//		System.out.println(hs);
		
		System.out.println("-----For Each Loop------");
		for(Object i:hs)
		{
			System.out.println(i);
		}
		
		System.out.println("---------Iterator-----");
		Iterator itr=hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
