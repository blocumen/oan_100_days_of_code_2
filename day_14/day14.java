package day_14;
import java.util.Scanner;


public class day14 {

	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("Enter the first number : ");
		Scanner obj=new Scanner(System.in);
		int num1=obj.nextInt();
		System.out.println("Enter the second number : ");
		int num2=obj.nextInt();
		
		int add =num1+num2;
		int diff=num1-num2;
		int product = num1*num2;
		int quotient= num1%num2;
		
		System.out.println("Sum is = " +add);
		System.out.println("Difference is = " + diff);
		System.out.println("Quotient is = " + quotient);
		System.out.println("Product is = " + product);
		
	}
}
