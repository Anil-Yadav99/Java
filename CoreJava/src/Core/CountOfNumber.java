package Core;

import java.util.Scanner;

public class CountOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NUmber:");
		int num=sc.nextInt();
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println("Digits present in Given number are:"+count);
	}

}
