package playcom.sai.playground.arrays;

import java.util.Arrays;

public class RemoveDuplictesFromArray {

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
