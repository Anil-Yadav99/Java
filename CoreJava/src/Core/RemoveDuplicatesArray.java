package Core;

import java.util.Scanner;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array");
		int n=sc.nextInt();
	    System.out.println("Enter element of array");
	    int[] a = new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	 a[i]=sc.nextInt();
	    }
		
		int j=0;
		
		for(int i=0;i<a.length;i++)
		{
		  if(a[j]!=a[i])
		  {
			  a[++j]=a[i];
		  }
		}
		
		for (int i = 0; i <= j; i++) {
            System.out.print(a[i] + " ");
		}
	}

}
