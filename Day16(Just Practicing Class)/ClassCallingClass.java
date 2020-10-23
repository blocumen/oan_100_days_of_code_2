package calc;

import java.io.*;
import java.util.Scanner;

class Addition {
        int sum = 0;
        public int addTwoInt(int a, int b){
// adding two integer value.
                sum = a + b;
//returning summation of two values.
                System.out.println(sum);
                return sum;

        }
}

class GFG {
        public static void main (String[] args) {
// creating an instance of Addition class
                Addition add = new Addition();
// calling addTwoInt() method to add two integer using instance created
// in above step.
                Scanner num = new Scanner(System.in);
                System.out.println("Please enter first number to add");
                int num1 = num.nextInt();
                System.out.println("Please enter second number to add");
                int num2 = num.nextInt();
                add.addTwoInt(num1,num2); // calling addition class via addition object
                //System.out.println("Sum of two integer values :"+ s);
        }
}
