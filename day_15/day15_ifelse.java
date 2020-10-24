package company.com;
import java.util.Scanner;
public class day15_ifelse {
	public static void main(String [] args) throws InterruptedException{
		
		
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1=obj.nextInt();
		
		System.out.println("Enter the second number : ");
		int num2=obj.nextInt();
		
		int sum = num1+ num2;
		if(sum>=100) {
			System.out.println("Sum is greater than 100");
		}
		else {
			System.out.println("Sum is less than 100");
		}
		
	
		
		
	}

}
