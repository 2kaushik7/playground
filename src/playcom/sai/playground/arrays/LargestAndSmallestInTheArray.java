package playcom.sai.playground.arrays;

import java.util.Arrays;

public class LargestAndSmallestInTheArray {

	public static void printLargestAndSmallestInTheArray(int[] numbers) {
		// Create variables largest and smallest.
		// Assign
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;

		for (int number : numbers) {
			if (number > largest) {
				largest = number;
			} else if (number < smallest) {
				smallest = number;
			}
		}
		System.out.println("Given array: " + Arrays.toString(numbers));
		System.out.println("\n" + smallest + "-" + largest);
	}

	public static void main(String[] args) {
		printLargestAndSmallestInTheArray(new int[] { 1, 5, 8, 2, 234, 0, 12 });
	}
}
