package playcom.sai.playground.string;

public class ReverseString {

	static String reverseUsingIteration(String str) {
		if (str == null || str.length() == 0) {

			return "No String present";
		} else {
			int length = str.length();
			String reverse = "";
			for (int i = length; i > 0; i--) {
				reverse = reverse + str.substring(i - 1, i);
			}
			return reverse;
		}
	}

	static String reverseUsingRecursion(String str) {
		String reverse = "";
		if (str == null || str.length() == 0) {
			return "No String present";
		} else {
			reverse = reverse + reverseUsingIteration(str);
		}

		return "";
	}

	public static void main(String[] args) {
		System.out.println(reverseUsingIteration(null));

	}

}
