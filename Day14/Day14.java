import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        double first = reader.nextDouble();
        double second = reader.nextDouble();

        System.out.println("Sum of the two numbers is: " + (first + second));
        System.out.println("Difference of the two numbers is: " + (first - second));
        System.out.println("Product of the two numbers is: " + (first * second));
        System.out.println("Quotient of the two numbers is: " + (first / second));
    }
}
