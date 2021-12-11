package playcom.sai.playground.arrays;

import java.util.Arrays;

public class RemoveDuplictesFromArray {

	// Array is a static data structure. We are modify the size once it is created.
	// Create a new array of same size and copy them after comparison
	// Take the first value into a variable for comparison
	// Iterate the array the compare if the previous value and current value are
	// same
	// If they are same do not copy into the new array
	// if they are same copy into new array
	// then copy the current element into the variable using for comparison
	public static int[] removeDuplicatesFromArrayWithoutUsingCollections(int[] numbers) {
		int[] result = new int[numbers.length];
		int previous = numbers[0];
		result[0] = previous;

		for (int i = 1; i < numbers.length; i++) {
			int ch = numbers[i];
			if (previous != ch) {
				result[i] = ch;
			}
			previous = ch;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(
				removeDuplicatesFromArrayWithoutUsingCollections(new int[] { 1, 2, 3, 4, 5, 5, 5, 6, 6, 6, 8, 9 })));
	}

}
