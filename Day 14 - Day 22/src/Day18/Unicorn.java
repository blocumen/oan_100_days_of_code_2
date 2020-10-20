package Day18;

/**
 * @author HGunjalli
 *
 */
public class Unicorn {
	// properties
	static int height = 170;
	static String power = "Double.infinity";

	// methods
	public static void sleep() {
		int minutesToSleep = 120;

		// Attempt to access
		System.out.println(minutesToSleep);
		// The next line will throw the error as the minutesToRun variable is declared
		// in the run().
		// System.out.println(mintuesToRun);
		System.out.println(height);
		System.out.println(power);
	}

	public static void run() {
		int minutesToRun = 60;

		// Attempt to access
		// The next line will throw the error as the minutesToRun variable is declared
		// in the run().
		// System.out.println(minutesToSleep);
		System.out.println(minutesToRun);
		System.out.println(height);
		System.out.println(power);
	}
}
