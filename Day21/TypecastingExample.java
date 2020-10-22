/*
    Module 3 - Day 21
    Typecasting

    byte->short->int->float->double
    Try making widening(left to right) and narrowing(right to left) typecasting by creating variables with this
    types byte->short->int->float->double
 */
public class TypecastingExample {
    public static void main(String[] args) {
        // Widening
        byte b = 127;
        short s = b;
        int i = s;
        float f = i;
        double d = f;

        System.out.println("byte variable: " + b + " (" + Byte.SIZE + " bytes)");
        System.out.println("byte --> short: " + s + " (" + Short.SIZE + " bytes)");
        System.out.println("short --> int: " + i + " (" + Integer.SIZE + " bytes)");
        System.out.println("int --> float: " + f + " (" + Float.SIZE + " bytes)");
        System.out.println("float --> double: " + d + " (" + Double.SIZE + " bytes)");
        System.out.println();

        // Narrowing
        double new_d = Math.PI;
        float new_f = (float)new_d;
        int new_i = (int)new_f;
        short new_s = (short)new_i;
        byte new_b = (byte)new_s;

        System.out.println("double variable: " + new_d  + " (" + Double.SIZE + " bytes)");
        System.out.println("double --> float: " + new_f + " (" + Float.SIZE + " bytes)");
        System.out.println("float --> int: " + new_i + " (" + Integer.SIZE + " bytes)");
        System.out.println("int --> short: " + new_s + " (" + Short.SIZE + " bytes)");
        System.out.println("short --> byte: " + new_b + " (" + Byte.SIZE + " bytes)");
    }
}
