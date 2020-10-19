/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day18;


public class Unicorn {
    static int height = 170;
    static String power = "Double.infinity";
    
    public static void main(String[] args) {
        int m2s, m2r;
        m2s = sleep();
        System.out.println("Main Sleep: " + m2s);
        m2r = run(m2s);
                System.out.println("Main Run: " + m2r);
    }
    
    public static int sleep(){
        int minutesToSleep = 120;
        
        System.out.println("Sleep: " + minutesToSleep);
        System.out.println("Sleep: " + run(minutesToSleep));
        System.out.println("Sleep: " + height);
        System.out.println("Sleep: " + power);
        
        return(minutesToSleep);
    }
    
    public static int run(int minutesToSleep2){
        int minutesToRun = 120;

        System.out.println("Run: " + minutesToSleep2);
        System.out.println("Run: " + minutesToRun);
        System.out.println("Run: " + height);
        System.out.println("Run: " + power);

        return(minutesToRun);
    }
            
}
