package collection;

import java.util.HashSet;

public class HashSetOPeraton2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet<Integer> num=new HashSet<Integer>();
       
       num.add(2);
       num.add(4);
       num.add(6);
       num.add(8);
       
       System.out.println("HasShet:"+num);
       
       HashSet<Integer> hs=new HashSet<Integer>();
       
       hs.addAll(num);
       hs.add(10);
       System.out.println("HahsSet 1:"+hs);
       
	}

}
