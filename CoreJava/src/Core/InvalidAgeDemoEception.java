package Core;

public class InvalidAgeDemoEception {

	public static void main(String[] args) {
		int age=19;
		try {
			if(age<18)
			{
				throw new MyException("Age should be Above 18 to proceed");
			}
			else
			{
				System.out.println("Age is valid to proceed");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
