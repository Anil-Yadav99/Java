package Core;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=12321;
       int num1=num;
       int rev=0;
       while(num!=0)
       {
    	  
    	   rev=10*rev+num%10;
    	   num=num/10;
       }
       
       if(rev==num1)
       {
    	   System.out.println("Palindrome");
       }
       else 
       {
    	   System.out.println("Not Palindrome");
       }
	}

}
