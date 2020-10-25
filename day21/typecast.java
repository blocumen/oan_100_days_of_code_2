package myPackage;

public class typecast {

    /*
    Try making widening(left to right) and narrowing(right to left)
    typecasting by creating variables with this types byte->short->int->float->double
     */
    public static void main(String[] args){

        //widening
        byte num1 = 125;
        short sh1 = num1;
        System.out.println(num1 + " in short is :" + sh1);
        int in1 = sh1;
        System.out.println("in int is : " + in1);
        float fl1 = in1;
        System.out.println("in float is : " + fl1);
        double db1 = fl1;
        System.out.println("in double is : " + db1);

        //narrowing
        double num2 = 1200.00;
        float fl = (float) num2;
        System.out.println(num2 + " in float is : " + fl);
        int in = (int) fl;
        System.out.println("in int is : " + in);
        short sh = (short) in;
        System.out.println("in short is : " + sh);
        byte by = (byte) sh;
        System.out.println("in byte is : " + by);
    }
}
