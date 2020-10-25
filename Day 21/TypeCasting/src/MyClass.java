public class MyClass {

    public static void main (String[] args){
        //left to right typecasting
        System.out.println("left to right type casting");
        byte  a =5;
        System.out.println("byte ="+a);
        short b = a;
        System.out.println("short ="+b);
        int c = b;
        System.out.println("int ="+c);
        float d =c;
        System.out.println("float ="+d);
        double e =d;
        System.out.println("double ="+e);
        //right to left
        System.out.println("Right to left type casting");
        double f = 221;
        System.out.println("double ="+f);
        float g = (float)f;
        System.out.println("float ="+g);
        int h = (int)g;
        System.out.println("int ="+h);
        short i =(short)h;
        System.out.println("short ="+i);
        byte j = (byte)i;
        System.out.println("byte ="+j);
    }
}
