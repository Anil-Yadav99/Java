package Singleton;

public class Emp {

	private static Emp emp=new Emp();
	
	
	// Early Initialization
	public static Emp getEmp()
	{
		return emp;
	}
}
