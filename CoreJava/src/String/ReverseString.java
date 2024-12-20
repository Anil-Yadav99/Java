package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Anil";
		
		//charAt()
		
		for(int i=str.length()-1;i>=0;i--)

		{
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		//toCharArray()
		
		char [] str1=str.toCharArray();
		
		for(int i=str1.length-1;i>=0;i--)
		{
			System.out.print(str1[i]);
		}
		
		// StringBuilder
		System.out.println();
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
		
		//StringBuffer
		
		StringBuffer sb1=new StringBuffer(str);
		System.out.println(sb1.reverse());
	}

}
