package collection;

import java.util.HashSet;

public class HahsSetOperaton3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet<Integer> hs=new HashSet<Integer>();
       
       hs.add(1);
       hs.add(2);
       hs.add(3);
       hs.add(4);
       hs.add(5);
       
       HashSet<Integer> hs1=new HashSet<Integer>();
       
       hs1.add(3);
       hs1.add(4);
       hs1.add(5);
       hs1.add(9);
       hs1.add(10);
       
       //Union
       
//       hs.addAll(hs1);
//       
//       System.out.println(hs); // 1,2,3,4,5,9,10
       
       //Intersection
       
//       hs.retainAll(hs1);
//       
//       System.out.println(hs); // 3,4,5
       
       
       //Difference
       
//       hs.removeAll(hs1);
//       
//       System.out.println(hs);  //1,2
       
       //Subset of Set
       
       hs.containsAll(hs1);
       System.out.println(hs); // 1,2,3,4,5
	}

}
