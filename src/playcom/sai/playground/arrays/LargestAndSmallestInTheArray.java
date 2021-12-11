package playcom.sai.playground.arrays;

import java.util.Arrays;

public class LargestAndSmallestInTheArray {

	// Create variables largest and smallest.
	// Assign Integer.MIN_VALUE constant to largest and Integer.MAX_VALUE to
	// smallest
	// Iterate the values in the array and check if number if greater than largest
	// and assign the variable if it is larger
	// If is not larger check if it is smaller than the smallest and assign it to
	// the variable if it is smaller
	// if is smaller than the largest and greater than the smallest go to next
	// number, just leave it
	public static void printLargestAndSmallestInTheArray(int[] numbers) {
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
