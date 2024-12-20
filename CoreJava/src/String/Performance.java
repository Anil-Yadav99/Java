package String;

public class Performance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String series=new String();
      
      for(int i=0;i<26;i++)
      {
    	  char ch=(char) ('a'+i);
    	  System.out.println(ch);
    	  series=series+ch;
    	  System.out.println(series);
    	  
    	  //O(N*2) time complexity
      }
	}

}
