import java.util.Scanner;

public class Calc{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");

        double first = reader.nextDouble();
        double second = reader.nextDouble();

//        public static int add(int a, int b){
//            return a+b;
//        }
//
//        public static int sub(int a, int b){
//            return a-b;
//        }
//
//        public static int multi(int a, int b){
//            return a*b;
//        }
//
//        public static int division(int a, int b){
//            if (b == 0){
//                return null;
//            }
//            return a/b;
//        }

        System.out.println("Sum of 2 numbers is: "+ (first + second));
        System.out.println("Sub of 2 numbers is: "+ (first - second));
        System.out.println("Mul of 2 numbers is: "+ (first * second));
        System.out.println("Div of 2 numbers is: "+ (first / second));


    }
}