import java.util.Scanner;

import static java.lang.Math.abs;

public class calculator {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number ");
        double num1= sc.nextDouble();
        System.out.print("Enter second number ");
        double num2= sc.nextDouble();

        double result = sum_custom(num1, num2);
        if(result > 50){
            System.out.print("The sum is greater than 50");
        }else{
            System.out.print("The sum is less than or equal to 50");
        }

        if(num1 < num2){
            divisibleByThreeinRange((int)num1, (int)num2);
        }else{
            divisibleByThreeinRange((int)num2, (int)num1);
        }
    }

    public static double sum_custom (double num1, double num2){
        return num1+num2;
    }

    public static void divisibleByThreeinRange (int beginning, int end){
        System.out.println("Finding numbers divisible by 3");
        boolean flag= false;
        for(int i=beginning; i<=end ; i++){
            if(i%3 == 0){
                flag = true;
                System.out.println(i);
            }
        }

        if(!flag){
            System.out.println("No numbers divisible by 3");
        }
    }
}
