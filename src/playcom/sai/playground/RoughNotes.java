package playcom.sai.playground;

import java.util.Arrays;

public class RoughNotes {

	public static void main(String[] args) {
//		int i = 1;
//		int j = 1;
//		System.out.println(++i);
//		System.out.println(j++);

		int[] arr = new int[] { 9, 2, 4, 5, 6, 7, 2, 3, 5, 7, 1, 0, 0 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int prev = 0;

		int[] arr2 = new int[arr.length];

		arr2[0] = arr[0];
		prev = arr[0];

		int i = 1;
		while (++i < arr.length) {
			if (arr[i] != prev) {
				arr2[i] = arr[i];
			}
			prev = arr[i];
		}
		System.out.println(Arrays.toString(arr2));

		int[] arrWithoutZeros = new int[arr2.length];
		int j = 0;
		while (j < arr2.length) {
			for (int t = 0; t < arr2.length; t++) {
				if (arr2[t] != 0) {
					arrWithoutZeros[j] = arr2[t];
					j++;

				}
			}
		}
		System.out.println(Arrays.toString(arrWithoutZeros));
	}

}
