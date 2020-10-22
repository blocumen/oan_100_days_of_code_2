/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {
        
        int num1, num2, sum;
        double res;
                
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        num1 = input.nextInt();
        System.out.print("Input the second number: ");
        num2 = input.nextInt();
        
        sum = add(num1, num2);
        System.out.println();
        System.out.println("Sum: "+sum);
               
        res = multiply(num1, num2);
        System.out.println();
        System.out.println("Result of multiplication: "+ res);
        
        res = div(num1, num2);
        System.out.println();
        System.out.println("Result of Division: "+ res);
    }
    
    public static int add(int n1, int n2){
        return( n1 + n2);
    }
      
    public static double multiply(double n1, double n2){
        return( n1 * n2);
    }
    
    public static double div(double n1, double n2){
        return( n1 / n2);
    }
}
