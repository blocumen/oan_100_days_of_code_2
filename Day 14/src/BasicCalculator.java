import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class BasicCalculator {

    static double sum(double a , double b) {
        return a+b ;
    }
    static double sub(double a , double b) {
        return a-b ;
    }
    static double prod(double a , double b) {
        return a*b ;
    }
    static double div(double a , double b) {
        return a/b ;
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for sum \n Ente 2 for sub \n Enter 3 for multiplication \n Enter 4 for division\n Enter 0 to exit");
        int choice = sc.nextInt();
        System.out.println("enter the two numbers");
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println(sum(a, b));
                    break;
                case 2:
                    System.out.println(sub(a, b));
                    break;
                case 3:
                    System.out.println(prod(a, b));
                    break;
                case 4:
                    System.out.println(div(a, b));
                    break;

            }
            System.out.println("Enter 1 for sum \n Ente 2 for sub \n Enter 3 for multiplication \n Enter 4 for division\n Enter 0 to exit");
            choice = sc.nextInt();

        }
    }



}
