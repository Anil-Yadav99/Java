package String;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a1="Anil";
       String b1="Anil";
       
    	System.out.println(a1==b1); //true
    	
      String a=new String("Anil");
      String b=new String("Anil");
      
      System.out.println(a==b);//false
      
     System.out.println(a.equals(b));  //true
     
     System.out.println(a.charAt(0));
	}

}
