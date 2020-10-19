package operations;

import java.util.Scanner;

public class Operations {

    public static void main(String[] args){
        Double number1,number2,sum,diff,mul,div;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number :");
        number1= sc.nextDouble();

        System.out.println("Please enter the second number :");
        number2= sc.nextDouble();

        sum=number1+number2;
        System.out.println("The sum of 2 numbers :"+sum);

        diff=number1-number2;
        System.out.println("The difference of 2 numbers :"+diff);

        mul=number1*number2;
        System.out.println("The product of 2 numbers :"+mul);

        div=number1/number2;
        System.out.println("The quotient of 2 numbers :"+div);


    }
}
