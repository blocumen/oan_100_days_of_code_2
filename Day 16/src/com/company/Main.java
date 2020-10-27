package com.company;

class Data {
    // private variable
    private String name;
}

public class Main {
    public static void main(String[] main){

//        // create an object of Data
//        Data d = new Data();
//
//        // access private variable and field from another class
//        d.name = "Programiz";
// accessing the public class
        Animal animal = new Animal();

                // accessing the public variable
                animal.legCount = 4;
                // accessing the public method
                animal.display();
    }
}
