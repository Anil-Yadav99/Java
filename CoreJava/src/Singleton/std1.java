package Singleton;

public class std1 {

	private static std1 std;
	
	private std1()
	{}
	

	public static std1 getstd1() {
		if(std==null)
		{
			 std=new std1();
	}
	
	   return std;

	}
	
}
