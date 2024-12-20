package Core;

import java.util.Arrays;

public class RemoveDuplicatesArray1 {
	public int[] removeDuplicates(int[] arr) {
		Arrays.sort(arr);
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[j] != arr[i]) {
				arr[++j] = arr[i];

			}
			
		}
		arr[j++]=arr[arr.length-1];
		return Arrays.copyOf(arr, j);
		
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 4, 5, 6, 6 };
		RemoveDuplicatesArray1 ar=new RemoveDuplicatesArray1();
		System.out.println(Arrays.toString(ar.removeDuplicates(arr)));

	}
}
