package String;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="Anil Yadav";
       
       System.out.println(str.charAt(0));
       System.out.println(str.toCharArray());
       System.out.println(str.toLowerCase());
       System.out.println(str.toUpperCase());
       System.out.println(str.indexOf("A"));
       
       System.out.println(Arrays.toString(str.split(" ")));
	}

}
