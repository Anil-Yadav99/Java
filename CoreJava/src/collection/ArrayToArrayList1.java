package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class ArrayToArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] str={"Anil","Jyoti","Ram","Shyam","Anil"};
		
		ArrayList<String> arr=new ArrayList<String>(Arrays.asList(str));
		HashMap <String,Integer> mp=new HashMap<String,Integer>();
		
		for(String str1:arr)
		{
			mp.put(str1,mp.getOrDefault(str1, 0)+1);
		}
		
		for(String str2:mp.keySet())
		{
			System.out.println(str2+"="+mp.get(str2));
		}
//		for(String i:arr) 
//		{
//			System.out.println(i);
//		}
//		
//		Iterator i=arr.iterator();
//		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
//		
		
	}

}
