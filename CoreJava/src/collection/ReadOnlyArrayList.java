package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReadOnlyArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		Collections.unmodifiableCollection(ar);
		ar.add(3);
		ar.set(0, 5);
		Collections.sort(ar);
		
		Iterator<Integer> itr=ar.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
