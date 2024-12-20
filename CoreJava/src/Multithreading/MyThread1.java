package Multithreading;

public class MyThread1 extends Thread {
	
	public void run()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
			try{Thread.sleep(1000);}
			catch(Exception e)
			{
				e.getMessage();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 m1=new MyThread1();
		MyThread t=new MyThread();
		m1.start();
		t.run();

	}

}
