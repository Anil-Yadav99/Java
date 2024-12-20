package streamApi;

import java.util.ArrayList;
import java.util.Collections;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(5);
		arr.add(7);
		arr.add(9);
		arr.add(11);
		arr.add(3);
		arr.add(6);
		arr.add(10);
		
		int sec=arr.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(sec);
		
	}

}
