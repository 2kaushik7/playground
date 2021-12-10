package playcom.sai.playground.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatedCharacters {

	// Taking a String as input to calculate the first not repeated characters
	// Method1: We use linked hash map.
	// create linked hash map object.
	// Convert string to character to char array using str.toCharArray()
	// Put each character in map as key and occurrence as value
	// while putting the value , check if character already exists if already exists
	// increase the value by 1 or put 1
	// Then iterate the map again check the which character has first occurrence as
	// 1

	public static Character firstNonRepeatedCharatcterUsingLinkedHashMap(String str) {
		Map<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			lhm.put(c, lhm.containsKey(c) ? lhm.get(c) + 1 : 1);
		}

		for (Entry<Character, Integer> element : lhm.entrySet()) {
			if (element.getValue() == 1)
				return element.getKey();
		}

		throw new RuntimeException("no non repeating elements");
	}

	// Method2:We use space and time trade-off
	// Create one arrayList and HashSet
	// Elements are inserted in arrayList first.
	// If the element already exists in the arraylist , we remove from arrayList and
	// place it in HasHset.
	// The first element in the Hashset is the first non repeated character

	public static Character firstNonRepeatingCharacterUsingListAndSet(String str) {
		List<Character> list = new ArrayList<Character>();
		Set<Character> set = new HashSet<Character>();

		// Set contains repeated characters
		// List contains non-repeated characters
		for (int c = 0; c < str.length(); c++) {
			char ch = str.charAt(c);

			if (set.contains(ch))
				continue;
			if (list.contains(ch)) {
				list.remove((Character) ch);
				set.add(ch);
			} else {
				list.add(ch);
			}

		}

		return list.get(0);

	}

	// Method3: Using HashMap
	// First create a HashMap object
	// We put elements and their occurrences in the HashMap.
	// It the element already exists we increase the value by 1 or if it is new
	// element we put 1
	// As there will be no insertion order maintained we iterate the String and get
	// the first non repeated value

	public static Character firstNonRepeatedCharacterUsingHashMap(String str) {
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		for (Character ch : str.toCharArray()) {
			hm.put(ch, hm.containsKey(ch) ? hm.get(ch) + 1 : 1);
		}

		for (Character ch : str.toCharArray()) {
			if (hm.get(ch) == 1)
				return ch;
		}

		throw new RuntimeException("no characters");
	}

	public static void main(String[] args) {

		System.out.println(firstNonRepeatedCharatcterUsingLinkedHashMap("kettle"));
		System.out.println(firstNonRepeatingCharacterUsingListAndSet("kettle"));
		System.out.println(firstNonRepeatedCharacterUsingHashMap("swiss"));

	}

}
