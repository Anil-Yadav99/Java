package collection;

import java.util.HashMap;
import java.util.Map;

public class ex1 {
public static void main(String[] args) {
	String str = "google";  
	//HashMap char as a key and occurrence as a value  
	HashMap <Character, Integer> charCount = new HashMap<>();  
	for (int i = str.length() - 1; i >= 0; i--)   
	{  
	if(charCount.containsKey(str.charAt(i)))   
	{  
	int count = charCount.get(str.charAt(i));  
	charCount.put(str.charAt(i), ++count);  
	}   
	else   
	{  
	charCount.put(str.charAt(i),1);  
	}  
	}  
	System.out.println(charCount);  
	Integer maxnum=0;
	
	
	for(Map.Entry entry:charCount.entrySet())
	{
		
		System.out.println(entry.getKey()+"="+entry.getValue());
	}
	
	
	
	for(int i:charCount.keySet())
	{
		if(i>maxnum) {
			maxnum=i;
		}
		else {
			maxnum=i;
		}
	}
	System.out.println(maxnum);
	}  





}
