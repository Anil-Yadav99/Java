package Core;

public class MinMaxArray1 {
 public static void main(String[] args) {
	int [] arr= {1,2,3,4,5,6,7,8,9};
	int min=arr[0];
	int max=arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println("Maximum:"+max);
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	System.out.println("Minimum:"+min);
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
	   sum+=arr[i];	
	}
	System.out.println("Sum of Element of Array:"+sum);
	 }
 

}
