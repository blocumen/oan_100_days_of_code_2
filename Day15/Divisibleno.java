package Day15;
import java.util.*;

import Day12.Block;



public class Divisibleno {
	 
	 public static void  divNumbers(int start,int end) {
		 int min=end;
		 for(int i=start;i<end;i++) {
			 if(i%3==0) {
				
				 
			 
			 if(i<min) {
				 min=i;
			 
			System.out.println(i);
			 } 
			 
		 }}
	 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b= sc.nextInt();
		divNumbers(a,b);

	}

}
