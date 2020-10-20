package calc;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Multiplication {
    public static void main(String[] args) throws InterruptedException {
        //********  Multiplication of 2 Numbers *******

        // First Number will be taken as input an will be added in variable name Num 1
        System.out.println("Please Enter The First Number To Multiply");
        Scanner obj = new Scanner(System.in); // scanner function which will ask for input
        int num1 = obj.nextInt();

        // Second Number will be taken as input an will be added in variable name Num 1
        System.out.println("Please Enter The Second Number To Multiply");
        int num2 = obj.nextInt();

        //multiplication Logic
        System.out.println("Please Wait Few Seconds As we calculate");
        TimeUnit.SECONDS.sleep(5);
        int mul = num1 + num2;
        System.out.println("Here you GO , Multiply for the Number is " + mul);
        System.out.println("Thanks for Using Our System");


    }
    }
