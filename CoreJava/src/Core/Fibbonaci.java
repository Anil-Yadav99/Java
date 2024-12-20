package Core;

import java.util.Scanner;

public class Fibbonaci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        int n1=0;
        int n2=1;
        int sum=0;
        System.out.println("Enter the Range of fibonacci Series");
        int range=sc.nextInt();
        
        System.out.print(n1+" "+n2);
        
        for (int i=2;i<range;i++)
        {
        	sum=n1+n2;
        	System.out.print(" "+sum);
        	
        	n1=n2;
            n2=sum;
            
        }
         
	}

}
