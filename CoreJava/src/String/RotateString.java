package String;
	public class RotateString {

	    // Method to rotate a string to the left
	    public static String rotateLeft(String str, int n) {
	        int len = str.length();
	        n = n % len; // Handle cases where n > length of the string
	        return str.substring(n) + str.substring(0, n);
	    }

	    // Method to rotate a string to the right
	    public static String rotateRight(String str, int n) {
	        int len = str.length();
	        n = n % len; // Handle cases where n > length of the string
	        return str.substring(len - n) + str.substring(0, len - n);
	    }

	    public static void main(String[] args) {
	        String original = "abcdef";
	        int rotateBy = 2;

	        System.out.println("Original String: " + original);

	        String rotatedLeft = rotateLeft(original, rotateBy);
	        System.out.println("Left Rotated by " + rotateBy + " characters: " + rotatedLeft);

	        String rotatedRight = rotateRight(original, rotateBy);
	        System.out.println("Right Rotated by " + rotateBy + " characters: " + rotatedRight);
	    }
	}

