package Core;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ReccuringCharacter {
	public static void main(String[] args) {
		String str="sweets";
		HashMap<Character,Integer> hmap=new LinkedHashMap<Character,Integer>();
		for(char c:str.toCharArray())
		{
			hmap.put(c,hmap.getOrDefault(c,0)+1);
			
		}
		
		for(Entry<Character, Integer> entry:hmap.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
			}
		}
	}

}
