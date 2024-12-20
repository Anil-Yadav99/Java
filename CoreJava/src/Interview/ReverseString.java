package Interview;

public class ReverseString {
 public static void main(String[] args) {
	
	 String str="AnilYadav";
	   
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
			
		}
		
		System.out.println("\n");
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
}
}
