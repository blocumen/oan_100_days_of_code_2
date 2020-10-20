package calc;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Division {
    public static void main(String[] args) throws InterruptedException {
        //********  Division of 2 Numbers *******

        // First Number will be taken as input an will be added in variable name Num 1
        System.out.println("Please Enter The First Number To divide");
        Scanner obj = new Scanner(System.in); // scanner function which will ask for input
        int num1 = obj.nextInt();

        // Second Number will be taken as input an will be added in variable name Num 1
        System.out.println("Please Enter The Second Number To divide");
        int num2 = obj.nextInt();

        //Division Logic
        System.out.println("Please Wait Few Seconds As we calculate");
        TimeUnit.SECONDS.sleep(5);
        int div = num1 / num2;
        System.out.println("Here you GO , div for the Number is " + div);
        System.out.println("Thanks for Using Our System");

        }

    }
