 
import java.util.Scanner;

public class Sum_diff {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("first number is:");
		int a=s.nextInt();
		
		System.out.println("second number is:");
		int b=s.nextInt();
		
	   int sum=a+b;
	   int diff=a-b;
	   int product=a*b;
	   int quo = a/b;
	   
	   System.out.println("sum of two numbers is:"+ sum);
	   System.out.println("difference of two numbers is:"+ diff);
	   System.out.println("product of two numbers is:"+ product);
	   System.out.println("quotient of two numbers is:"+ quo);

	}

}