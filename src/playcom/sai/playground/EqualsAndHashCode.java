package playcom.sai.playground;

import java.util.Arrays;
import java.util.BitSet;

public class EqualsAndHashCode {

	private int id;

	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// one missing number
		printMissingNumber(new int[] { 1, 2, 3, 4, 6 }, 6);

//		// two missing number
//		printMissingNumber(new int[] { 1, 2, 3, 4, 6, 7, 9, 8, 10 }, 10);
//
//		// three missing number
//		printMissingNumber(new int[] { 1, 2, 3, 4, 6, 9, 8 }, 10);
//
//		// four missing number
//		printMissingNumber(new int[] { 1, 2, 3, 4, 9, 8 }, 10);
	}

	private static void printMissingNumber(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet(count);
		for (int number : numbers) {
			bitSet.set(number - 1);
		}
		System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers),
				count);
		int lastMissingIndex = 0;
		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}

}
