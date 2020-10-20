/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day20;

class Superclass {
    private String objectVariable;
    
    public Superclass() {
        this("Example");
    }
    
    public Superclass(String value) {
        this.objectVariable = value;
    }
    
    public String toString() {
        return this.objectVariable;
    }
}//end super class

public class Subclass extends Superclass{
     
    public Subclass() {
        super("Subclass");
    }

    @Override
         public String toString() {
            return super.toString() + "\n  And let's add my own message to it!";
         }
            
    public static void main(String[] args) {
        String over_ride; 
        Superclass sup = new Superclass("Hello!");
        Subclass sub = new Subclass();
         
         System.out.println(sup);
         System.out.println(sub);
         System.out.println(sup.toString());
    }
} //end subclass
