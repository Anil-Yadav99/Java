package collection;

import java.util.ArrayDeque;

public class DeQueueOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayDeque ad=new ArrayDeque();
        
        ad.add(10);
        ad.add(12);
        
        System.out.println(ad);
        
        //offer
        ad.offerFirst(5);
        ad.offerLast(15);
        
        System.out.println(ad);
        
        //Element
        
        System.out.println(ad.element());
        
        //peek
        
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        
        //remove
        System.out.println(ad.remove());
       
        //poll
        
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
        
        System.out.println(ad);
	}

}
