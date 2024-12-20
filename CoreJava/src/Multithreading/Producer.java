package Multithreading;

public class Producer extends Thread {
	Company c;
	
	Producer(Company c)
	{
		this.c=c;
	}
	public void run() 
	{
		int i=1;
		while(true) 
		{
			try {
				this.c.produceItem(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.getMessage();
			}
			i++;
			}
		}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
