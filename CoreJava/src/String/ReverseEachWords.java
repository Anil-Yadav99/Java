package String;

public class ReverseEachWords {

	public static void main(String[] args) {
		        String str = "Hello World from Java";
		        String result = reverseWords(str);
		        System.out.println(result);
		    }

		    public static String reverseWords(String str) {
		        // Split the string into words
		        String[] words = str.split(" ");
		        String result = "";

		        // Reverse each word manually and append to the result
		        for (String word : words) {
		            result += reverseWord(word) + " ";  // Reverse and add space
		        }

		        // Trim the result to remove the trailing space
		        return result.trim();
		    }

		    // Method to reverse a single word manually
		    public static String reverseWord(String word) {
		        char[] charArray = word.toCharArray();
		        String reversedWord = "";

		        // Reverse the word by iterating from the end to the beginning
		        for (int i = charArray.length - 1; i >= 0; i--) {
		            reversedWord += charArray[i];
		        }

		        return reversedWord;
		    }
		

       
	}

