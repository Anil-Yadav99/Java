package Interview;

import java.util.Arrays;

public class RemoveDuplicates {
	    public static int removeDuplicates(int[] arr) {
	        if (arr.length == 0) return 0;

	        int j = 0; // Pointer to track unique elements

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[j] != arr[i]) {
	                arr[++j] = arr[i]; // Copy unique element to next position
	            }
	        }

	        // Print the unique elements
	        for (int k = 0; k <= j; k++) {
	            System.out.println(arr[k]);
	        }
	        
	        return j + 1; // Return the count of unique elements
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 3, 4, 5, 5, 6, 6, 7};
	        int uniqueCount = removeDuplicates(arr);
	        System.out.println("Total unique elements: " + uniqueCount);
	    }
	}

