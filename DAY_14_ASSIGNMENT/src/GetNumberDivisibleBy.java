import java.util.*;

class GetNumberDivisibleBy {
	
	static void getNumbers(int x, int y, int d) {
		for(int i=0; i<y; i++) {
			if (i % d == 0) {
				System.out.print(i + " ");	
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Which number's multiples would you like to have?");
		int divisbleNum = scan.nextInt();
		
		System.out.println("Please enter first number!");
		int firstNum = scan.nextInt();
		
		System.out.println("Please enter second number!");
		int secondNum = scan.nextInt();
		
		System.out.println("The numbers between" + firstNum + " and " + secondNum + " divisible by 3 are:");
		getNumbers(firstNum, secondNum, divisbleNum);
		scan.close();
	}
}
