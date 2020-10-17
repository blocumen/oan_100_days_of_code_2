import java.util.*;

public class Sum
{
	int num1;
	int num2;
	public void sum()
		{
			if(num1+num2>50)
			System.out.println("The Number is greater than 50");
			else
			System.out.println("The Number is lesser than 50");
			}
	
	public static void main (String[] arg)
	{
		Scanner inpt = new Scanner(System.in);
		int a = inpt.nextInt();
		int b = inpt.nextInt();
		Sum obj = new Sum();
		obj.num1 = a;
		obj.num2 = b;
		obj.sum();
		}
}
