package Core;

public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {50,30,60,20,10};
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("maximum of array: "+max);
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("minimum of array: "+min);
	}  

}
