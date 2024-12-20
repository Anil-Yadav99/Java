package String;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="Java Programming";
       
       //Using java 8
        
     /*  StringBuilder sb=new StringBuilder();
       str.chars().distinct().forEach(c->System.out.print((char)c));
          */
       
       //Using indexOf()
       
       StringBuilder sb1=new StringBuilder();
       
       for(int i=0;i<str.length();i++)
       {
    	   char ch=str.charAt(i);
    	   int idx=str.indexOf(ch,i+1);
    	   
    	   if(idx==-1)
    	   {
    		   sb1.append(ch);
    	   }
    	   
       }
       System.out.println(sb1);
       
       
       //Using character Array
       
       /

       
       //Using Set interface
       
    /*   StringBuilder sb3=new StringBuilder();
       Set<Character> set=new LinkedHashSet<>();
       
       for(int i=0;i<str.length();i++)
       {
    	   set.add(str.charAt(i));
       }
       
       Iterator itr=set.iterator();
       while(itr.hasNext())
       {
    	   System.out.print(itr.next());
       }*/
       
       
	}

}
