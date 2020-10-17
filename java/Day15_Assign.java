import java.util.Scanner;

public class Day15_Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int a= s.nextInt();
		
		for(int i=0;i<50;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
		
		

	}

}
