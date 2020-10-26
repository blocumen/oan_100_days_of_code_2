package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int begin,end;

        System.out.println("Enter Beginning Number");
        begin = sc.nextInt();
        System.out.println("Enter End Number");
        end= sc.nextInt();

        for (int i=begin;i<=end;i++){
            if (i % 3 ==0){
                System.out.println(i);
            }
        }

    }
}
