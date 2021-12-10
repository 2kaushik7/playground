package playcom.sai.playground.string;

import java.util.Arrays;

//If two words are said to be anagrams, if and only if two words have same length and have same characters in them.
public class Anagrams {

	// Input are two strings
	// Return false if length of the characters are not same or one of them is null
	// Consider one word for converting them into character array.
	// check each character is present in the other word using indexOf() if not
	// return false
	// if contains remove that character from other word using substring()
	// concatenate two substrings EXCLUDING THAT CHARACTER
	// and finally check if other word isEmpty()
	public static boolean anagramOrNotUsingIterationAndDeletetion(String word1, String word2) {
		if (word1.length() != word2.length())
			return false;
		else {
			char[] word1Array = word1.toCharArray();
			for (char ch : word1Array) {
				int index = word2.indexOf(ch);
				if (index != -1) {
					word2 = word2.substring(0, index) + word2.substring(index + 1, word2.length());
				} else
					return false;
			}
			return word2.isEmpty();
		}
	}

	// Input is two Strings
	// Convert both Strings into Arrays
	// Sort both arrays
	// Using Arrays.equals() check equality using both arrays
	// return the appropriate result
	public static boolean anagramUsingArraySort(String word1, String word2) {
		char[] word1Array = word1.toCharArray();
		char[] word2Array = word2.toCharArray();
		Arrays.sort(word1Array);
		Arrays.sort(word2Array);
		if (word1Array.length == word2Array.length) {
			return Arrays.equals(word1Array, word2Array);
		} else
			return false;

	}

	// Input is two Strings
	// Create StringBuilder object on one of the word
	// Create array from one of the word
	// Iterate the array and check if the character is present in the other word
	// If present delete the character from the other word using sb.deleteCharAt
	// Finally check sb.length == 0
	// sb.isEmpty will not work because it is StringBuffer object
	public static boolean anagramUsingDeleteCharAt(String word1, String word2) {

		StringBuilder sb = new StringBuilder(word2);
		if (word1.length() != word2.length()) {
			return false;
		} else {
			char[] word1Array = word1.toCharArray();
			for (char ch : word1Array) {
				int index = sb.indexOf("" + ch);
				if (index != -1) {
					sb.deleteCharAt(index);
				} else {
					return false;
				}
			}
			return sb.length() == 0 ? true : false;
		}
	}

	public static void main(String[] args) {
		System.out.println(anagramOrNotUsingIterationAndDeletetion("mary", "army"));
		System.out.println(anagramUsingArraySort("mary", "armys"));
		System.out.println(anagramUsingDeleteCharAt("mary", "army"));
	}

}
