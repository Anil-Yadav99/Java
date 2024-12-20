package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1,"Anil");
		map.put(2,"Jyoti");
		map.put(3,"abc");
		
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("Anil"));
		System.out.println(map.get(2));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		map.remove(3);
		System.out.println(map.isEmpty());
		for(int i:map.keySet())
		{
			System.out.println(i+"="+map.get(i));
		}
		
		Set s=map.entrySet();
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
