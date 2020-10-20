
/**
 * @author HGunjalli
 *
 */
import java.util.Scanner;

public class Day14 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			// Get number inputs
			System.out.println("Enter two numbers");
			System.out.print("Enter first number:");
			double num1 = scan.nextDouble();
			System.out.println();
			System.out.println("Enter second number");
			double num2 = scan.nextDouble();

			System.out.println("---------------------------");
			System.out.println(performMath(num1, num2, '+'));
			System.out.println(performMath(num1, num2, '-'));
			System.out.println(performMath(num1, num2, '*'));
			System.out.println(performMath(num1, num2, '/'));
		}
	}

	public static boolean performMath(double num1, double num2, char op) {
		switch (op) {
		case '+':
			System.out.println("Sum of two numbers:" + (num1 + num2));
			return true;
		case '-':
			System.out.println("Differenc of two numbers: " + (num1 - num2));
			return true;
		case '*':
			System.out.println("Product of two numbers: " + (num1 * num2));
			return true;
		case '/':
			if (num2 == 0) {
				System.out.println("Division not possible with divider 0");
				return false;
			}
			System.out.println("Quotient of two numbers: " + (num1 / num2));
			return true;
		default:
			return false;
		}
	}

}
