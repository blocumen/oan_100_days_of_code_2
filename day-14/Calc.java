import java.util.Scanner;

public class Calc{

    public static double add(double a, double b){
        return a+b;
    }

    public static double sub(double a, double b){
        return a-b;
    }

    public static double multi(double a, double b){
        return a*b;
    }

    public static double division(double a, double b){
        if (b == 0){
            return 0.0;
        }
        return a/b;
    }

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");

        double first = reader.nextDouble();
        double second = reader.nextDouble();

//        System.out.println("Sum of 2 numbers is: "+ (first + second));
        System.out.println("Sum of 2 numbers is: "+ add(
                first, second));
//        System.out.println("Sub of 2 numbers is: "+ (first - second));
        System.out.println("Sub of 2 numbers is: "+ sub(
                first, second));

//        System.out.println("Mul of 2 numbers is: "+ (first * second));
        System.out.println("Mul of 2 numbers is: "+ multi(
                first, second));

//        System.out.println("Div of 2 numbers is: "+ (first / second));
        System.out.println("Div of 2 numbers is: "+ division(
                first, second));
    }
}