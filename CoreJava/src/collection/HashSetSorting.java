package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs=new HashSet();
		 
		hs.add(50);
		hs.add(40);
		hs.add(60);
		hs.add(10);
		hs.add(70);
		
		TreeSet ts=new TreeSet(hs);
		
		System.out.println(ts);

	}

}
