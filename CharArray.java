package array.practice;

/* To create an array of all 26 character using for loop
 * Print the length of the array
 * Print all array items
 */

public class CharArray {
	// Main method
	public static void main(String[] args) {
	
	// A character array with a length of 26
		char[] array = new char[26];
		
	// Index holds index position of a character while looping 
		int index = 0;
		for (char aChar = 'a'; aChar <= 'z'; aChar++) {
			aChar = array[index++];
		}
		
		String result = new String(array); // Convert to a string.

		// Checks if the character array starts with abc
		System.out.println(result.startsWith("abc"));
		
		// Prints array length
		System.out.println(result.length());
		
		// Prints the array with all the elements
		System.out.println(result);
	}
}
