
public class Day21 {
	public static void main(String[] args)
	{
		// Widening....
		byte bw = 32;
		short sw = bw;
		int iw = sw;
		float fw = iw;
		double dw = fw;
		
		// Output of the widening operation.
		System.out.println("Widening byte: " + bw);
		System.out.println("Widening short: " + sw);
		System.out.println("Widening int: " + iw);
		System.out.println("Widening float: " + fw);
		System.out.println("Widening double: " + dw);
		
		// Narrowing....
		double dn = 1234567.123;
		float fn = (float)dn;
		int in = (int)fn;
		short sn = (short) in;
		byte bn = (byte) sn;
		
		// Output of the narrowing operation.
		System.out.println("Narrowing double: " + dn);
		System.out.println("Narrowing float: " + fn);
		System.out.println("Narrowing int: " + in);
		System.out.println("Narrowing short: " + sn);
		System.out.println("Narrowing byte: " + bn);
		
	}

}
