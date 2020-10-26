import java.util.Scanner;

public class PerformOperations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first number!");
		int num1 = scan.nextInt();
		
		System.out.println("Please enter second number!");
		int num2 = scan.nextInt();
		
		System.out.println("Which type of operation do you want to perform?");
		System.out.println("Enter A for Add");
		System.out.println("Enter S for Subraction");
		System.out.println("Enter M for Multiplication");
		System.out.println("Enter D for Division");
		char opType = scan.next().charAt(0);
		
		if (opType == 'A')
			System.out.println("The result is: " + (num1 + num2));
		else if (opType == 'S')
			System.out.println("The result is: " + (num1 - num2));
		else if (opType == 'M')
			System.out.println("The result is: " + (num1 * num2));
		else if (opType == 'D')
			System.out.println("The result is: " + (num1 / num2));
		else
			System.out.println("Operation not found!");
		
		scan.close();
	}

}
