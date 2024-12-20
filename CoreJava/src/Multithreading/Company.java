package Multithreading;

public class Company {
    int n;
    boolean t=true;
    //t=true chance:producer
	synchronized public void produceItem(int n) throws InterruptedException {
		if(!t)
		{
			wait();
		}
		this.n=n;
		System.out.println("Produced"+this.n);
		t=false;
		notify();
	}
	
	synchronized public int consumeItem() throws InterruptedException
	{   if(t)
	{
		wait();
	}
		System.out.println("Consumed"+this.n);
		t=true;
		notify();
		return this.n;
		
	}
	

}
