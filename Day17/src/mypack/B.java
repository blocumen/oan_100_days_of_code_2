/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;
import pack.*;

/**
 *
 * @author eleqsr
 */
public class B {
    public static void main(String args[]){  
        A obj = new A(); //Compile Time Error  
        obj.msg(); //Compile Time Error  
    }  
}
