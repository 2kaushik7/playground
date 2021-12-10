package playcom.sai.playground.arrays;

import java.util.BitSet;

public class MissingInteger {

	public static void main(String[] args) {
		missingInteger(new int[] { 1, 2, 3, 4, 7, 8, 9, 10, 14 }, 14);
	}

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
