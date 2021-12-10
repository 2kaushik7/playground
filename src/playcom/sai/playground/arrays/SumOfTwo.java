package playcom.sai.playground.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SumOfTwo {

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
