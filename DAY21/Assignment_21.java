import java.util.*;

public class Assignment_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double 	num1=0;
		byte 	num2=0;
		
		System.out.println("ENTER TWO NUMBER :");
		Scanner myObj = new Scanner(System.in);
		num1 = myObj.nextInt();
		num2 = myObj.nextByte();
		
		
		System.out.println("\n\n------------ DOWNWARD/NORROWING TYPE CASTING ------------");
		System.out.println("THE ENTERED NUMBER IS "+ num1);
		System.out.println("to float 	:"+(float) num1);
		System.out.println("to int 		:"+(int) num1);
		System.out.println("to short 	:"+(short) num1);
		System.out.println("to byte 	:"+(byte) num1);
		
		
		System.out.println("\n\n------------ UPWARD/WIDENING TYPE CASTING ------------");
		System.out.println("THE ENTERED NUMBER IS "+ num2);
		System.out.println("to short 	:"+(short) num2);
		System.out.println("to int 		:"+(int) num2);
		System.out.println("to float 	:"+(float) num2);
		System.out.println("to double 	:"+(double) num2);
		
	}

}
