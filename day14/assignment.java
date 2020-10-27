import java.util.*;
class UserInputDemo   
{  
	public static void main(String[] args)  
	{  
			Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
			System.out.print("Enter first number- ");  
			int a= sc.nextInt();  
			System.out.print("Enter second number- ");  
			int b= sc.nextInt();  
			String test = "Hello";

			System.out.println("Sum = " +(a+b));  
			System.out.println("difference = " +(a-b));  
			System.out.println("Product = " +(a*b));  
			System.out.println("Quotient = " +(a/b));  

			System.out.println("without brackets");

			System.out.println("Sum = " +a+b);  
			System.out.println("difference = " + (a-b));  
			System.out.println("Product = " +a*b);  
			System.out.println("Quotient = " +a/b);  
	}  
}  
