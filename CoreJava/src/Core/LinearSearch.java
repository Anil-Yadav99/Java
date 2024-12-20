package Core;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,8,9,10};
		 int num=5;
		for(int i=1;i<a.length;i++)
		{
			if(num==a[i])
			{
				System.out.println("Element found in Array: "+a[i]);
			}
			
		}
		
	}

}
