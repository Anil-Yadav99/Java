package Multithreading;

public class ThreadOperation extends Thread {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Program Started.....");
        int x=10+10;
        System.out.println("Sum is:"+x);
        Thread t=Thread.currentThread();
        String name=t.getName();
        System.out.println("Current Thread:"+name);
        
        t.setName("vaayu");
        System.out.println(t.getName());
        try {
        	Thread.sleep(2000);
        }
        catch(Exception e)
        {
        	e.getMessage();
        }
        
        System.out.println(t.getId());
        
        //going to call userthread
        
        UserThread ut=new UserThread();
        ut.run();
        System.out.println("Program ended.....");
	}

}
