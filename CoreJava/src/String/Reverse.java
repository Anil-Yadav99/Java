package String;

public class Reverse {

	public static void main(String[] args) {
		String str="aba";
		String str1=str;
		 String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
		    rev=str.charAt(i)+rev;
		}
		
		System.out.println(rev);
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
