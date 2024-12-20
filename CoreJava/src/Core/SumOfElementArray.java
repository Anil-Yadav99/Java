package Core;

public class SumOfElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
         System.out.println("Sum of element of array is:"+sum);
	}

}
