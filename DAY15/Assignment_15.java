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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 	no1;
		int 	no2;
		float 	res = 0;
		
		Scanner myObj = new Scanner(System.in);
		System.out.print("\nSUMMATION OF TWO NUMBER\n");
		
	
		System.out.println("Enter any 2 digit whole Num :");
		no1 = myObj.nextInt();
		System.out.println("Enter any 2 digit whole Num :" );
		no2 = myObj.nextInt();
		
		res = Summation(no1,no2);
		System.out.println("The sum fo two numbers are :" + res);
		
		if(res > 50)
			System.out.println("THE SUM IS GREATER THAB 50");	
		
		if(res < 50)
			System.out.println("THE SUM IS GREATER THAB 50");
	}

}
