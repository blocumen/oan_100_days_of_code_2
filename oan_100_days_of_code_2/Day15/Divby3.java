import java.util.*;
public class Divby3{
	
	public static void main(String[] a){
		
		Scanner inpt = new Scanner(System.in);
		int start = inpt.nextInt();
		int end = inpt.nextInt();
		for (int i = start/3; i*3<=end; i++)
		{
			if(i*3>=start)
				{
					System.out.println(i*3);
					}
			}
		}
	}
