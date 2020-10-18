import java.util.*;

public class Assignment_15 {

	public int 		num1 	;
	public int 		num2 	;
	public static float	result	;
	
	public static float Summation(int num1, int num2)
	{
		result = num1  + num2 ;
		return result;
	}
	
	public static void Divisiblity(int num1, int num2)
	{
		System.out.print("The number Divisible by 3's are :");
		for(int i=num1 ; i<=num2 ; i++)
		{
			result = i%3 ;
			if(result == 0)
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 	no1;
		int 	no2;
		float 	res = 0;
		String	func;
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("SELECT OPERATION TO PERFORM ?");
		System.out.println("A - SUMMATION");
		System.out.println("D - DIVISIBILITY BY 3\n");
		
		func = myObj.nextLine();
		System.out.println("THE SELECTED OPERATION :" + func);
		
		
		
	
		System.out.println("Enter any 2 digit whole Num :");
		no1 = myObj.nextInt();
		System.out.println("Enter any 2 digit whole Num :" );
		no2 = myObj.nextInt();
		
		if(func.equals("A"))
		{
			System.out.println("\nSUMMATION OF TWO NUMBER");
			res = Summation(no1,no2);
			System.out.println("The sum fo two numbers are :" + res);
			
			if(res > 50)
				System.out.println("THE SUM IS GREATER THAN 50");	
			
			if(res < 50)
				System.out.println("THE SUM IS LESS THAND 50");
		}
		
		if(func.equals("D"))
		{
			System.out.println("Divisibility by 3");
			Divisiblity(no1, no2);			
		}
		
	}

}
