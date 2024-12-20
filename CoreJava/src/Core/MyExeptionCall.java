package Core;

public class MyExeptionCall {

	public static void main(String[] args) throws MyExceptionDemo2  {
		int age=17;
		
		if(age<18)
		{
			throw new MyExceptionDemo2();
		}
		
		
	}
}
