package String;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="test";
		String str1= new String("test");
		String str2="test";
		
		if(str==str1)
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Fail");
		}
		
		if(str==str2)
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
