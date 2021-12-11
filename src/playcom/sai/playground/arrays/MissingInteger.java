package playcom.sai.playground.arrays;

import java.util.BitSet;

public class MissingInteger {

	public static void main(String[] args) {
		missingInteger(new int[] { 1, 2, 3, 4, 7, 8, 9, 10, 14 }, 14);
	}

	// This logic is written based on bitset class
	// Sort the integers if they are not in sorted order
	// Calculate the missing count by subtracting count - length of the array
	// Create bitset using the count
	// Iterate each number and set the the number -1 value. AS per study they become
	// true or 1
	// Iterate the array again by the missing count number of times
	// Using bitset.nextClearBit get the integermissing
	// Integermissing + 1 is the missing value because we are setting number -1 as
	// bitset starts with 0
	public static void missingInteger(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet(count);

		for (int number : numbers) {
			bitSet.set(number - 1); // number - 1 because bitset is array based and index starts with 0 and setting
									// false to true
		}
		int integerMissing = 0;
		for (int i = 0; i < missingCount; i++) {
			integerMissing = bitSet.nextClearBit(integerMissing);
			System.out.println(++integerMissing);
		}
	}

}
