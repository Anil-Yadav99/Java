package Core;

public class FactRecursion {
	
	public int fact(int num)
	{
		if(num==0 || num==1)
			return 1;
		else 
			return num*fact(num-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		FactRecursion f=new FactRecursion();
		System.out.println(f.fact(num));

	}

}
