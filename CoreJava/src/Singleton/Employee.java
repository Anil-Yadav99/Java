package Singleton;

public class Employee {
	
	public static Employee emp;
	
	private Employee()
	{}
	
	public static Employee getEmployee()
	{
		if(emp==null)
		{
			emp=new Employee();
		}
		
		return emp;
	}

}
