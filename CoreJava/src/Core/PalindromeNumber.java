package Core;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		 int n=num;
		int rev=0;
		while(num!=0)
		{
			rev=10*rev+num%10;
			num=num/10;
		}
		
		if(rev==n)
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}

	}

}
