package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedHashSet hs=new LinkedHashSet();
       
       hs.add(1);
       hs.add(2);
       hs.add(3);
       hs.add(4);
       hs.add(5);
       System.out.println(hs);
       System.out.println(hs.getFirst());
       System.out.println(hs.getLast());
       
       Iterator itr=hs.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
	}

}
