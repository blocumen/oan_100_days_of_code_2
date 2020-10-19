package mypack;
import pack.*;

public class B {
    public static void main(String[] args) {
        A obj = new A(); // Compile time error
        obj.msg(); // Compile time error
    }
}
