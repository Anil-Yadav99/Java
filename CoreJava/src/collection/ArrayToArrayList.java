package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String arr[]={"Dog","Cat","Rat","Elephant"};
       for(String val:arr)
       {
    	   System.out.println(val);
       }
       
       ArrayList al=new ArrayList(Arrays.asList(arr));
       //
       System.out.println("After Loop");
       for(int i=0;i<al.size();i++)
       {
    	   System.out.println(al.get(i));
       }
       //
       System.out.println("After Foreach:");
       for(Object str:al)
       {
    	   System.out.println(str);
       }
       //
       System.out.println("After Iterator");
       Iterator itr=al.iterator();
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
       }
       
       Collections.sort(al);
       System.out.println("After sorting:"+al);
       
       Collections.sort(al,Collections.reverseOrder());
       System.out.println("Reverse order:"+al);
       
       Collections.shuffle(al);
       System.out.println("Shuffled Array:"+al);
       
	}

}
