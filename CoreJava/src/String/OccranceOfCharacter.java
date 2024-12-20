package String;

import java.util.HashMap;

public class OccranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    String str="Banana";
		        // Create a HashMap to store the count of each character
		        HashMap<Character, Integer> map = new HashMap<>();

		        // Iterate through the string and count occurrences of each character
		        for (char c : str.toCharArray()) {
		            map.put(c, map.getOrDefault(c, 0) + 1);
		        }

		        // Display the occurrence of each character
		        for (char c : map.keySet()) {
		            System.out.println(c + ": " + map.get(c));
		        }	
		}
}
