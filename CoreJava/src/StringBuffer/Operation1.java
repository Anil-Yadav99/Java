package StringBuffer;

public class Operation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuffer sb=new StringBuffer();
        sb.append("Anil Yadav");
        
        sb.insert(2, "Vaayu");
        sb.replace(2, 7,"ABC");
        sb.delete(2,5);
        sb.reverse();
        String str=sb.toString();
        System.out.println(str);
	}

}
