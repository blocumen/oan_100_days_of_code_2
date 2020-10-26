package calc;

public class Unicorn {
    // properties
    private int height = 170;
    public String power = "Double.infinity";
    // methods
    private static void sleep() {
    }
    public static void run() {
    }
}

//    Unicorn unicorn = new Unicorn();
//System.out.println(unicorn.power); // Ok
//        unicorn.height = 180; // Error
//        unicorn.sleep(); // Error
//        unicorn.run(); // Ok


public class PublicClass {
    public boolean publicProperty = true;
    int internalProperty = 0; //default at package-private
    private String fileprivateProperty = "Hello!"
    private static void privateMethod() {
    }
}


// Public variable in private class will be converted to package private

class PrivateClass {
    int internalProperty = 0; // automatically assigned package-private by default
    protected defaultProperty = "true"; // automatically assigned package-private
    public boolean publicProperty = true; // automatically converted to package-private
    private String fileprivateProperty = "Hello!"; //only available to the class
    private static void privateMethod() {
    }
}
