package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		
		//HashMap<Integer,String> m=new HashMap<Integer,String>();
		
		m.put(101, "Anil");
		m.put(102,"Vaayu");
		m.put(103, "Jyoti");
		m.put(104, "SS");
		m.put(104, "Vaayu");
		m.put(102,"XYZ");
		
		System.out.println(m);
      
		//get()		
		System.out.println(m.get(102));  //XYZ
		
		//remove()		
		m.remove(104);
		System.out.println(m);
		
		//containsKey()		
		System.out.println(m.containsKey(102)); //true
		System.out.println(m.containsValue("Anil")); //true
		
		//isEmpty()		
		System.out.println(m.isEmpty()); // False
		
		//keySet()		
		System.out.println(m.keySet()); //101 102 103
		
		System.out.println("-------Normal For Each Loop -----------");
		for(Object i:m.keySet())
		{
			System.out.println(i+"="+m.get(i));
		}
		
		//values()	
		//System.out.println(m.values()); //Anil XYZ Jyoti
		
		//entrySet()		
	    //System.out.println(m.entrySet());  // return all entries
	    
	    //Entry Interface -> it specifies single entry of the map
		System.out.println("-------Entry Interface---------");
		for(Map.Entry entry:m.entrySet())
		{
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
        
		//Iterator
		System.out.println("--------Iterator----------");
		Set s=m.entrySet();
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
