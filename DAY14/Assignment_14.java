import java.util.*;

public class Assignment_14 {
	
	public int 		num1 	;
	public int 		num2 	;
	public static float	result	;
	
	public static float Summation(int num1, int num2)
	{
		result = num1  + num2 ;
		return result;
	}
	
	
	public static float substraction(int num1, int num2)
	{
		result = num1  - num2 ;
		return result;
	}
	
	public static float multiplication(int num1, int num2)
	{
		result = num1  * num2 ;
		return result;
	}
	
	public static float division(int num1, int num2)
	{
		result = num1 / num2 ;
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 	no1;
		int 	no2;
		float 	res = 0;
		String	func;
		
		Scanner myObj = new Scanner(System.in);
		System.out.print("Kindly select which operation you want to Perform ? ");
		System.out.print("\nA - SUMMATION ");
		System.out.print("\nS - SUBSTRACTION ");
		System.out.print("\nM - MULTIPLICATION ");
		System.out.print("\nD - DIVISION\n");
		func = myObj.nextLine();
		System.out.println("The selected keyword is : "+ func);
		
		System.out.println("Enter any 2 digit whole Num :");
		no1 = myObj.nextInt();
		System.out.println("Enter any 2 digit whole Num :" );
		no2 = myObj.nextInt();
		
		if(func.equals("A"))
		res = Summation(no1,no2);
		
		if(func.equals("S"))
		res = substraction(no1,no2);

		if(func.equals("M"))
		res = multiplication(no1,no2);
		if(func.equals("D"))
		res = division(no1,no2);
		
		System.out.println("The result is :"+ res);
	}

}
