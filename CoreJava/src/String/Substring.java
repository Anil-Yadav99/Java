package String;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="Anil";
         
         for(int i=0;i<str.length();i++)
         {
        	 for(int j=i+1;j<=str.length();j++)
        	 {
        		 System.out.println(str.substring(i,j));
        	 }
         }
	}

}
