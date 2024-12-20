package collection;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Hashtable<String,Integer> ht=new Hashtable();  // default capacity 11, load factor is 0.75
      
      ht.put("Anil", 95);
      ht.put("Jyoti", 99);
      ht.put("Pratyush", 96);
      
      System.out.println(ht.get("Anil"));
      
      System.out.println(ht.keySet());
      System.out.println(ht.values());
      
      for(Object i:ht.keySet())
      {
    	  System.out.println(i+"="+ht.get(i));
      }
    	System.out.println(ht.containsKey("Anil"));
    	System.out.println(ht.containsValue(99));
    	
    	ht.remove("Pratyush");
    	System.out.println(ht);
    	System.out.println();
    	
    	for(Map.Entry entry:ht.entrySet())
    	{
    		System.out.println(entry.getKey()+"   "+entry.getValue());
    	}
    	
    	
    	Set s=ht.entrySet();
    	
    	Iterator itr=s.iterator();
    	while(itr.hasNext())
    	{
    		System.out.println(itr.next());
    	}
    	
	}
	
	
	

}
