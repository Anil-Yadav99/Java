package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeSet ts=new TreeSet();
       
       ts.add(20);
       ts.add(10);
       ts.add(30);
       ts.add(50);
       ts.add(40);
       
       System.out.println(ts);
       
       System.out.println("--------Iterator ----------");
       Iterator itr=ts.iterator();
        while(itr.hasNext())
        {
         System.out.println(itr.next());
         
        }
        
        System.out.println("---------for Each -----------");
        for(Object i:ts)
        {
        	System.out.println(i);
        }
        
        System.out.println(ts.isEmpty()); //false
        System.out.println(ts.contains(10)); //true
        
        
        System.out.println(ts.descendingSet());
        
        System.out.println(ts.reversed());
	}
	

}
