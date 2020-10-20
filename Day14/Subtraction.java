package calc;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Subtraction {

    public static void main(String[] args) throws InterruptedException {
        //********  Subtract of 2 Numbers *******

        // First Number will be taken as input an will be added in variable name Num 1
        System.out.println("Please Enter The First Number To Subtract");
        Scanner obj = new Scanner(System.in); // scanner function which will ask for input
        int num1 = obj.nextInt();

        // Second Number will be taken as input an will be added in variable name Num 1
        System.out.println("Please Enter The Second Number To Subtract");
        int num2 = obj.nextInt();

        //Sub Logic
        System.out.println("Please Wait Few Seconds As we calculate");
        TimeUnit.SECONDS.sleep(5);
        int sub = num1 - num2;
        System.out.println("Here you GO , Difference for the Number is " + sub);
        System.out.println("Thanks for Using Our System");


    }

    }
