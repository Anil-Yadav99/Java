package Core;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="Jyoti";
         String rev="";
         
         // 1. Using ChatAt method
         
//         for(int i=str.length()-1;i>=0;i--)
//         {
//        	rev=rev+str.charAt(i); 
//         }
//         System.out.println("Reverse of String:"+rev);
         
        // 2. Using Character Array
         
//         char a[]=str.toCharArray();
//         
//         for(int i=a.length-1;i>=0;i--)
//         {
//        	 System.out.print(a[i]);
//         }
         
         StringBuffer strb=new StringBuffer(str);
         System.out.println(strb.reverse());
	}

	

}
