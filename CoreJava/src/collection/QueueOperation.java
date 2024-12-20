package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueOperation {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		
		//add()
		
		pq.add(1);
		pq.add(2);
		
		//offer()
		
		pq.offer(3);
		pq.offer(4);
		
		System.out.println(pq);
		//Iterator
		System.out.println("------Iterator-----");
		Iterator itr=pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//For each loop
		
		System.out.println("--------for each----------");
		for(Object i:pq)
		{
			System.out.println(i);
		}
		//element()
		
		System.out.println("Element:"+pq.element());
		
		//peak()
		
		System.out.println("Peek:"+pq.peek());

		//remove()
		
		System.out.println("----Remove---");
		pq.remove();
		System.out.println(pq);
		
		//poll()
		
		System.out.println("----Poll-----");
		pq.poll();
		System.out.println(pq);
	}

}
