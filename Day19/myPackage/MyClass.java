/*
    Module 3 - Day 19
    Packages and Java API

    Create a directory myPackage (name should be the same as the name of the package).
    Then create the MyClass inside the directory with the first statement being the package names.
    Inside MyClass create a method name “getNames” which takes a one string parameter and prints the string using println.
    Make another Class outside the package folder and then import the package myPackage to it and then try to invoke the method to print the string
 */
package myPackage;

public class MyClass {
    public void getNames(String name) {
        System.out.println("The name you have entered is: " + name);
    }
}
