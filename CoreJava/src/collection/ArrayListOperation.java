package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ArrayListOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		// ArrayList<Integer> al1=new ArrayList<Integer>();
		// ArrayList <String> al2=new ArrayList<String>();
		// List al=new ArrayList();
        int[] ar= {1,2,2,3,4,5,6,7};
		// add() element in array list
        for(int i:ar)
        {
        	al1.add(i);
        }
//        Set<Integer> hs=new LinkedHashSet<Integer>(al1);
//        Iterator itr=hs.iterator();
//        while(itr.hasNext())
//        {
//        	System.out.println(itr.next());
//        }
		al.add(1);
		al.add("Vaayu");
		al.add(15.5);
		al.add('A');
		al.add(true);

		System.out.println(al);

		// Size() of array list
		System.out.println("Objects stored in array list: " + al.size());

		// remove()
		al.remove(2);
		System.out.println(al);

		// contains()
		System.out.println(al.contains("Vaayu")); //true

		// insert new element
		al.add(2, "Jyoti");
		System.out.println(al);
		
		//get()
		System.out.println(al.get(2)); //Jyoti
		
		//set()
		al.set(3, 'B');
		System.out.println(al);
		
		//isEmpty()
		
		System.out.println(al.isEmpty()); //false
		
		//read data using for loop
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		//read data using for-each loop
	      for(Object i:al)
	      {
	    	 System.out.println(i); 
	      }
		//read data using iterator
	      Iterator i=al.iterator();
	      while(i.hasNext())
	      {
	    	  System.out.println(i.next());
	      }
	}

}
