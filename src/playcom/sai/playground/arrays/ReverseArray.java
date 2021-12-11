package playcom.sai.playground.arrays;

import java.util.Arrays;

public class ReverseArray {
	// If it is a string array convert to character array
	// iterate the array it middle of the array
	// Swap first element with last element using third variable technique
	// subtract counter variable from length - 1 give the second element to swap
	// (length - i -1)
	public static void main(String[] args) {
		// int[] a = new int[] { 4, 3, 8, 9 };

		// String str = "kaushik";

		char[] a = "kaushik".toCharArray();

		// int temp = 0;
		char temp;

		int l = a.length;

		for (int i = 0; i < l / 2; i++) {
			temp = a[i];
			a[i] = a[l - i - 1];
			a[l - i - 1] = temp;

		}

		System.out.println(Arrays.toString(a));

	}

}
