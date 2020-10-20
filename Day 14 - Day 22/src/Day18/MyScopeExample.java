package Day18;

/**
 * @author HGunjalli
 *
 */
public class MyScopeExample {
	static String root = "I'm available to all line of code within my context";

	public static void main(String[] args) {
		String spy = "I'm a spy";
		System.out.println(root);
		System.out.println(spy);
		// The next line results in error as the variable is not declared in this method
		// scope but in the helpfulFunction() scope.
		// Hence, the error.
		// System.out.println(anotherSpy);
	}

	public static void helpfulFunction() {
		String anotherSpy = "I'm another spy";
		System.out.println(root);
		System.out.println(anotherSpy);
		// The next line results in error as the variable is not declared in this method
		// scope but in the main() scope.
		// Hence, the error.
		// System.out.println(spy);
	}

}
