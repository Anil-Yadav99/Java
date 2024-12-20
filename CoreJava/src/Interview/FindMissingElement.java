package Interview;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar= {1,2,3,4,6,7,8,9,10}; 
        int n1=missingElement(ar);
        System.out.println("Missing Element:"+n1);
	}

	public static int missingElement(int [] arr)
	{
		int n=arr.length;
		int num=(n*(n+1))/2;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		return (sum-num);
	}
}
