public class Typecast {

    public static void main(String ... a)
    {
        byte b = (byte)128;
        short s = (short)128;
        int i = (int)128;
        float f = (float)128;
        double d = (double)128;

        System.out.println("Byte ->"+b+" short ->"+s+" int ->"+f+" float ->"+f+" double ->"+d);
        System.out.println("double ->"+d+" float ->"+f+" int ->"+i+" short ->"+s+" byte ->"+b);
    }

}
