import java.util.Scanner;

import static java.lang.Math.abs;

public class calculator {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number ");
        double num1= sc.nextDouble();
        System.out.print("Enter second number ");
        double num2= sc.nextDouble();

        System.out.print("The sum " + (num1 + num2));
        System.out.print("\n The product " + (num1 * num2));
        System.out.print("\n The difference " + abs((num1 - num2)));
        System.out.print("\n The quotient " + (num1 / num2));

    }
}
