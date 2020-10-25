package Day14;
import java.util.*;
public class Operations {
	
	public static int addition(int a,int b) {
		return a+b;
	}
	public static int subtraction(int a,int b) {
		return a-b;
	}
	public static int multiplication(int a,int b) {
		return a*b;
	}
	public static int division(int a,int b) {
		return a/b;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a:");
		int a= sc.nextInt();
		System.out.println("Enter b:");
		int b= sc.nextInt();
		System.out.println(addition(a,b));
		System.out.println(subtraction(a,b));
		System.out.println(multiplication(a,b));
		System.out.println(division(a,b));
		

	}

}
