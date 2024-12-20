package String;

import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) {
		String str="Jyoti";
		String str1="iotJ";
		
		str.toLowerCase();
		str1.toLowerCase();
		
		char[] str2=str.toCharArray();
		char[] str3=str1.toCharArray();
		
		if(str2.length!=str3.length)
		{
			System.out.println("Not anagram");
		}
		else
		{
			Arrays.sort(str2);
			Arrays.sort(str3);
			
			boolean areanagram=Arrays.equals(str2, str3);
			
			if(areanagram==true)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
					
		}
		
	}
}
