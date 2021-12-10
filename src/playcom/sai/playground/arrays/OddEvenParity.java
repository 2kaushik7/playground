package playcom.sai.playground.arrays;

public class OddEvenParity {

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
