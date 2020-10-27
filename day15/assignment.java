import java.util.*;
class UserInputDemo   
{  
	public static void divisibleByThreeinRange (int beginning, int end)
	{
		if(beginning > end)
		{
			int initialValue = beginning;
			beginning = end;
			end = initialValue;
		}

		int modulsValue = 3 - beginning % 3;

		do {
			if((beginning % 3) == 0)
			{
				System.out.println(beginning);
			}

			beginning = beginning + modulsValue;
			modulsValue = 3;
		}
		while(beginning <= end);
	}

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

			if((a+b) > 50) {
				System.out.println("The Number is greater than 50");
			}
			else {
				System.out.println("The number is less than 50");
			}

			divisibleByThreeinRange(a,b);
	}  
}  
