package playcom.sai.playground.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//*********Read this first************
//We are taking a String
// Creating a map which can hold character as key and Integer value
//We converted the String into character array using str.toCharArray()
//we inserted each character as key and value is occurrence.
//**Occurrence is calculated by by checking if the map already contains the character.
//if contains  we are getting the already existing value by map.get and adding 1 to it
//if its a new character placing 1 in the value
//Then we getting are entrySet and iterating through it and checking any character key has value more than 1 and printing it. 

public class DuplicatesInTheString {

	public static void main(String[] args) {
		String str = "Hibiscus";

		Map<Character, Integer> map = new HashMap<>();

		for (Character ch : str.toCharArray()) {
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}

		Set<Map.Entry<Character, Integer>> keySet = map.entrySet();
		for (Map.Entry<Character, Integer> entry : keySet) {
			if (entry.getValue() > 1)
				System.out.println(entry.getKey() + "-" + entry.getValue());
		}

	}

}
