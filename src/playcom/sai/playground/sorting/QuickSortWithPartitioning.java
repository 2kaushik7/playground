package playcom.sai.playground.sorting;

public class QuickSortWithPartitioning {

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr, i + 1, high);
		return (i + 1);

	}

	public static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}

	}

	public static void swap(int[] arr, int r, int s) {
		int temp = 0;

		temp = arr[r];
		arr[r] = arr[s];
		arr[s] = temp;

	}

	public static void main(String[] args) {

		int[] arr = { 10, 7, 8, 9, 1, 5, 24, 4, 15 };
		int n = arr.length;

		quickSort(arr, 0, n - 1);
		System.out.println("Sorted array: ");
		printArray(arr);

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
