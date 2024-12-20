package Interview;

public class Factorial {
 public static void main(String[] args) {
	int n=5;
	int fac=fact(n);
	System.out.println("Factorial of given number:"+fac);
}
 
 public static int fact(int num)
 {
	 if(num==0||num==1)
	 {
		 return 1;
	 }
	 else
	 {
		 return num*fact(num-1);
	 }
 }
}
