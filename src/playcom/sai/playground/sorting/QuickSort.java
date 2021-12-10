package playcom.sai.playground.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void quickSort(Integer[] arr, int low, int high) {

		// check for empty or null array
		if (arr == null || arr.length == 0) {
			return;
		}

		if (low >= high) {
			return;
		}

		int pivot = arr[low + (high - low) / 2];

		int i = low, j = high;

		while (i <= j) {
			while (pivot > arr[i]) {
				i++;
			}
			while (pivot < arr[j]) {
				j--;
			}
			if (i <= j) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}

		if (low < j) {
			quickSort(arr, low, j);
		}

		if (high > i) {
			quickSort(arr, i, high);
		}

	}

	public static void swap(Integer[] arr, int i, int j) {
		int temp = 0;

		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
		quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));

	}

}
