/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day18;

/**
 *
 * @author eleqsr
 */
public class MyScopeExample {
    static String root = "I'm available";
        
    public static void main(String[] args) {
        String spy = "I'm a spy";
        System.out.println("Main: " + root);
        System.out.println("Main: " + spy);
        System.out.println("Main: " + helpfulFunction(spy));
    }
    
    public static String helpfulFunction(String spy2) {
        String anotherSpy = "helpfulFunction:I'm another spy";
        System.out.println("helpfulFunction: " + root);
        System.out.println("helpfulFunction: " + anotherSpy);
        System.out.println("helpfulFunction: " + spy2);
        
        return(anotherSpy);
    }
}
