package Interview;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sweets";
		StringBuilder sb=new StringBuilder();
		boolean[] seen = new boolean[256];
		for(char c:str.toCharArray())
		{
			if(!seen[c])
			{
				seen[c]=true;	
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}

}
