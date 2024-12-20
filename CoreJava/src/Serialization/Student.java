package Serialization;

public class Student {

	private String name;
	private String email;
	private int age;
	private String add;
	
	public Student(String name, String email, int age, String add) {
		
		this.name = name;
		this.email = email;
		this.age = age;
		this.add = add;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}
	
	public void displayName()
	{
		System.out.println("Hello");
	}
}
