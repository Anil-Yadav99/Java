package StringBuilder;

public class Operation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuilder b=new StringBuilder();

        for(int i=0;i<26;i++)
        {
      	  char ch=(char) ('a'+i);
      	  System.out.println(ch);
      	  b.append(ch);
        }
        System.out.println(b.toString());
        System.out.println(b.reverse());
	}

}
