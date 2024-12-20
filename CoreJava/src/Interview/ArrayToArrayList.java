package Interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayToArrayList {
public static void main(String[] args) {
	int [] arr= {1,2,3,4,5,6,7,8,6,7};

ArrayList<Integer> ar=new ArrayList<Integer>();

for(int i:arr)
{
	ar.add(i);
}
Set<Integer> s=new LinkedHashSet<Integer>(ar); 

Iterator i=s.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
}
}
