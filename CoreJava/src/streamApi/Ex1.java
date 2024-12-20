package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex1 {

	public static void main(String[] args) {
List<Integer> l1= new ArrayList<Integer>();
l1.add(123);
l1.add(33);
l1.add(23);
l1.add(345);
l1.add(3);
l1.add(5);
l1.add(32);
l1.add(34);
l1.add(45);
Long count=l1.stream().filter((l)->l%2==0).count();
System.out.println(count);



ArrayList<String> l2= new ArrayList<String>();
l2.add("dfsd");
l2.add("fsf");
l2.add("dfsdfs");
l2.add("fsdfs");
l2.add("fsdfef");
l2.add("ssdfsd");
l2.add("fsd");
l2.add("fsdfe");
l2.add("dsdd");
l2.add("dfsd");
l2.add("dfs");
List<String> list=l2.stream().filter(s->s.length()%2==0).collect(Collectors.toList());
for(String s:list) {
	System.out.println(s);
}

ArrayList<Integer> ar=new ArrayList<Integer>();
ar.add(2);
ar.add(5);
ar.add(3);
ar.add(4);
ar.add(6);
List<Integer> l3=ar.stream().map(n->n=n+5).collect(Collectors.toList());

for(int i:l3)
{
	System.out.println(i);
}












	}

}
