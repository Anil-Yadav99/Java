package Interview;

public class StingPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="anil";
		StringBuilder result = new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch%2==0)
			{
				result.append(Character.toUpperCase(ch));
			}
			else
			{
				result.append(Character.toLowerCase(ch));
			}
			
		}
		System.out.println(result);

	}

}
