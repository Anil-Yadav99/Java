package Singleton;

public class Student {
	
	private static Student std;
	
	private Student()
	{}
	
	//lazy initialization 
	public static Student getStudent()
	{ 
		
		synchronized(Student.class){
		if(std==null)
		
		{
			std=new Student();
		}
		
		}
		return std;
	}

}
