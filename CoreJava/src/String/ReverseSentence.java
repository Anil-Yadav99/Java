package String;

public class ReverseSentence {

	public static void main(String[] args) {
		String str="Welcome to my first String Program";
		
		String [] s=str.split(" ");
		String output="";
		for(int i=s.length-1;i>=0;i--)
		{
			output+=s[i]+" ";
		}
		
		System.out.println("Output::"+output);
	}
}
