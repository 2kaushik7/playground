package playcom.sai.playground;

import java.util.function.BiPredicate;

public class Lambda {

	public static void main(String[] args) {
		executeLambda((i, s) -> String.valueOf(s.charAt(i)) == "e");

	}

	static void executeLambda(BiPredicate<Integer, String> p) {
		int i = 1;
		String str = "test";
		System.out.println(p.test(i, str));
	}

}

interface Test {
	public int lambdaTest();
}
