package Singleton;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//Student std1=Student.getStudent();
		
		//System.out.println(std1.hashCode());
		
        Student std2=Student.getStudent();
		
		//System.out.println(std1.hashCode());
		
		System.out.println(Emp.getEmp().hashCode());
		System.out.println(Emp.getEmp().hashCode());
		
		std1 std=std1.getstd1();
		System.out.println(std);
		
		
		
		}

}
