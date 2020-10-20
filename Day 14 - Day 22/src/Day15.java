
/**
 * @author HGunjalli
 *
 */

import java.util.Scanner;

public class Day15 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			// Get number inputs
			System.out.println("Enter two numbers");
			System.out.print("Enter start range:");
			long num1 = scan.nextLong();
			System.out.println();
			System.out.println("Enter end range:");
			long num2 = scan.nextLong();

			if (num2 < num1) {
				System.out.println("Invalid range provided");
			}

			System.out.println("---------------------------");
			System.out.print("Printing the numbers divisible by 3 in the range provided:");
			divisibleByThreeInRange(num1, num2);
		}
	}

	public static void divisibleByThreeInRange(long begin, long end) {
		long i = begin;
		while (i <= end) {
			if (i % 3 == 0) {
				System.out.print(i + ",");
			}
			i++;
		}
	}
}
