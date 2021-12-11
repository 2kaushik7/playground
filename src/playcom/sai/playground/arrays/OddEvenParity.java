package playcom.sai.playground.arrays;

public class OddEvenParity {

	// Check if the first integer in the array is odd or even assign the parity
	// Then iterate the array from second number i.e num[1] and check the next
	// number is not equal to parity
	// If it is not equal assign the parity
	// It is same return the value when OddEvenParity is missing
	// If all elements maintain the alternate parity send -1
	public static int checkOddEven(int[] num) {
		int parity = num[0] % 2 == 1 ? 1 : 0;
		for (int i = 1; i < num.length; i++) {
			if (num[i] % 2 != parity)
				parity = num[i] % 2;
			else
				return num[i];
		}
		return -1;

	}

	public static void main(String[] args) {
		System.out.println(checkOddEven(new int[] { 1, 2, 3, 4, 5 }));

	}

}
