package Core;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
        System.out.print("Enter the Number:");
        int num=sc.nextInt();
        
        if(num>1)
        {
        	for(int i=1;i<=num;i++)
        	{
        		if(num%i==0)
        		{
        			count++;
        			
        		}
        	}
        		if(count==2)
        		{
        		System.out.println("Given number is Prime");
        		}
        		else
        		{
        			System.out.println("Number is not prime");
        		}
        		
        	}
        
        else 
        {
        	System.out.println("Not a prime number");
        }
	}

}
