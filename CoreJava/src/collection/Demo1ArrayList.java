package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Demo1ArrayList {

	public static void main(String[] args) {
	
		int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 5};

        // Convert int[] to Integer[] and then to ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : ar) {
            arr.add(num);
        }

        // Sort the ArrayList
        Collections.sort(arr,Collections.reverseOrder());

        // Print the sorted elements
        for (int num : arr) {
            System.out.print(num);
        }
    
	}
}
