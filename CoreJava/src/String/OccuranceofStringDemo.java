package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class OccuranceofStringDemo {
	public static void main(String[] args) {
		String str = "aabbccddeedss";
		char ch;
		for(int j=str.length()-1;j>=0;j--)
		{
			 ch=str.charAt(j);
			 System.out.print(ch);
		}
	    System.out.println("\n");
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();

		for (char i : str.toCharArray()) {
			mp.put(i, mp.getOrDefault(i, 0) + 1);

		}

		for (char c : mp.keySet()) {
			System.out.println(c + "=" + mp.get(c));
		}
		
		int [] ar= {1,1,2,3,4,4,5,5,5};
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int k:ar)
		{
			map.put(k, map.getOrDefault(k, 0)+1);
		}
		
		for(int l:map.keySet())
		{
			System.out.println(l+"="+map.get(l));
		}
	}
}
