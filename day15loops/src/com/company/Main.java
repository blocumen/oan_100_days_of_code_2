package com.company;
import java.util.Scanner;

public class Main {
    public static void divTest(int beggining, int end){
        for(int i=beggining; (i>=beggining)&&(i<=end);i++){
            if(i%3==0){
                System.out.println(i);

            }
        }
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the beggining number :");
        int a = read.nextInt();
        System.out.println("Enter the end number :");
        int b = read.nextInt();
	    divTest(a,b);
    }
}
