package Core;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]>max)
        	{
        		max=arr[i];
        	}
        }
        System.out.println("Maximum element of array:"+max);
        int min=arr[0];
        for(int j=0;j<arr.length;j++)
        {
        	if(arr[j]<min)
        	{
        		min=arr[j];
        	}
        }
        
        System.out.println("Minimum element of array:"+min);
        // Reverse the array between indices 0 and 5
        reverseArray(arr, 0, 5);
        // Print the reversed array
        System.out.println("Reversed Array: " + Arrays.toString(arr));
        System.out.println("Removed Array:"+Arrays.toString(arr));
    }

//    public static int[] reverseArray(int[] ar, int start, int end) {
//        int temp;
//        while (start < end) {
//            // Swap elements at 'start' and 'end'
//            temp = ar[start];
//            ar[start] = ar[end];
//            ar[end] = temp;
//
//            // Move the indices
//            start++;
//            end--;
//        }
//        return ar;
//    }
    public static int[] reverseArray(int [] ar,int start,int end)
    {
    	int temp;
    	while(start<end)
    	{
    		temp=ar[start];
    		ar[start]=ar[end];
    		ar[end]=temp;
    		
    		start++;
    		end--;
    	}
    	return ar;
    }
    
}
