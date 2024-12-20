package Core;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String:");
		String str=sc.nextLine();
		String str1=str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
        if(rev.equals(str1))
        {
        	System.out.println("Given string is palindrome");
        	
        }
        
        else
        {
        	System.out.println("Given String is not palindrome");
        }
	}

}
