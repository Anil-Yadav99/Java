package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOperation {

	public static void main(String[] args) {

     LinkedList l=new LinkedList();
     //LinkedList<Integer> l=new LinkedList<Integer>();
     
     //add()
     
     l.add("Anil");
     l.add("Vaayu");
     l.add(100);
     l.add(12.12);
     l.add('A');
     l.add(null);
     l.add(true);
     
     System.out.println(l);
     
     //size()
     
     System.out.println(l.size());
     
     //remove()  index
     
     l.remove(1);
     System.out.println(l);
     
     //remove() value
     
     l.remove(12.12);
     System.out.println(l);
     
     //add element in middle 
     
     l.add(1, "Vaayu");
     System.out.println(l);
     
     //retriving value from value get()
     
     System.out.println(l.get(1));
     
     //set()
     
     l.set(4, 'B');
     System.out.println(l);
     
     //contains()
     
     System.out.println(l.contains("Java")); //false
     
     //isEmpty()
     
     System.out.println(l.isEmpty()); //false
     
     //For Loop
     System.out.println("Reading Element using for loop");
     for(int i=0;i<l.size();i++)
     {
    	 System.out.println(l.get(i));
     }
     
     //Using For Each loop
     
     System.out.println("Reading element using foreach loop");
     for(Object i:l)
     {
    	 System.out.println(i);
     }
     
     //Using Iterator
     
     System.out.println("Reading Element using Iterator");
     
     Iterator itr=l.iterator();
     while(itr.hasNext())
     {
    	 System.out.println(itr.next());
     }
     
	}

}
