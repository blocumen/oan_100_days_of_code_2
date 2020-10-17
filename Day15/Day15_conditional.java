import java.util.Scanner;

public class Day15_conditional {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        double first = reader.nextDouble();
        double second = reader.nextDouble();
        double sum = first + second;

        System.out.println("Sum of the two numbers is: " + sum);
        if(sum > 50)
            System.out.println("Sum of " + first + " and " + second + " is greater than 50.");
        else
            System.out.println("Sum of " + first + " and " + second + " is less than 50.");
    }
}
