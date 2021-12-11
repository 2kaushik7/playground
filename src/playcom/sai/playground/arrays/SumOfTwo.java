package playcom.sai.playground.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Ask is which pair of elements in the given array sums up to the count given 
public class SumOfTwo {
	// Create a hash map and start iterating the array
	// Calculate the difference of sum and current element
	// Check if the difference exists as an element if existing return the pair
	// If does not exist insert it the element as key in the hashmap and value as
	// the index
	static int[] solutionUsingMap(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int comp = target - nums[i];
			if (map.containsKey(comp))
				return new int[] { map.get(comp), i };
			else
				map.put(nums[i], i);
		}
		return null;

	}

	// Return empty array if the element size is less than 2
	// Same logic as above but using hashset
	// Check if the hashset contains the difference or insert it
	// If the difference exists as the element return the pair
	// if does not exist insert difference as the element
	static int[] solutionUsingSet(int[] nums, int target) {
		System.out.println(Arrays.toString(nums));
		Set<Integer> hs = new HashSet<Integer>();

		if (nums.length < 2)
			return new int[] {};
		for (int t = 0; t < nums.length; t++) {
			int result = target - nums[t];

			if (hs.contains(result)) {
				return new int[] { result, nums[t] };
			}
			hs.add(nums[t]);
		}

		return new int[] {};

	}

	// This is for generating the random array of numbers
	static int[] generateRandomNumbers(int length) {
		int[] randomIntegerArray = new int[length];
		for (int r = 0; r < length; r++) {
			randomIntegerArray[r] = (int) (Math.random() * 15);
		}

		return randomIntegerArray;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solutionUsingMap(new int[] { 1, 5, 6 }, 7)));
		System.out.println(Arrays.toString(solutionUsingSet(generateRandomNumbers(9), 15)));

		int a = Integer.valueOf("1");

	}

}
