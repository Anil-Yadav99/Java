package Core;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num=1234567;
      
      int even=0;
      int odd=0;
      int n=0;
      while(num!=0)
      {
    	  n=num%10;
    	  
    	  if(n%2==0)
    	  {
    		  even++;
    	  }
    	  else
    	  {
    		  odd++;
    	  }
    	  num=num/10;
      }
      
      System.out.println("Count of Even:"+even+" "+"Count of Odd:"+odd);
	}

}
