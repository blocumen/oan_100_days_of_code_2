/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackageV2;
import java.util.Scanner;

public class MyClassV2 {
        public static void main(String[] args) {
        
        String name;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.next(); 
        getNames(name);   
        }
        
        public static void getNames(String yourName){
            System.out.print("Your name is: " + yourName); 
        }
}
