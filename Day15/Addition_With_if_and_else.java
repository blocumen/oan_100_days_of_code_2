package calc;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Addition {
    public static void main(String[] args) throws InterruptedException {
        //********  Addition of 2 Numbers *******

            // First Number will be taken as input an will be added in variable name Num 1
            System.out.println("Please Enter The First Number To Add");
            Scanner obj= new Scanner(System.in); // scanner function which will ask for input
            int num1 = obj.nextInt();

            // Second Number will be taken as input an will be added in variable name Num 1
            System.out.println("Please Enter The Second Number To Add");
            int num2 = obj.nextInt();

            //Addition Logic
            System.out.println("Please Wait Few Seconds As we calculate");
            TimeUnit.SECONDS.sleep(5);
            int add = num1 + num2;

            if (add > 50) {
                    System.out.println("The Number is Greater than 50, The Number is " + add);
            }
            else if (add >= 50)
            {
                    System.out.println("Walla The Number is exact 50");
            }
            else
            {
                    System.out.println("The Number is less than 50, The Number is " + add);
            }


            //System.out.println("Here you GO , Sum for the Number is " + add );
            System.out.println("Thanks for Using Our System" );



        //System.out.println(name + " is my name");


    }

}
