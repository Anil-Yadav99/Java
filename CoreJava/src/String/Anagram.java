package String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str="Anil";
           String str1="linA";
           
           char[] str2=str.toCharArray();
           char[] str3=str1.toCharArray();
           
           Arrays.sort(str2);
           Arrays.sort(str3);
           
           boolean anagram=false;
          anagram= Arrays.equals(str2, str3);           
           if(anagram=true)
           {
        	   System.out.println("String is anagram");
           }
           else 
           {
        	   System.out.println("String is not Anagram");
           }
	}

}
