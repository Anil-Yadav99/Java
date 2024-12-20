package String;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="anana";
        String str1=str;
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
        
			rev=rev+str.charAt(i);
        }
      
		if(rev.equals(str1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
        	
	}

}
