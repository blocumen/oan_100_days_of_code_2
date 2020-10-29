package Day16;

import java.util.Scanner;

public class ObjectDeclaration {
	
	int sum = 0;
	public int addTwoInt(int a, int b){
	
	sum = a + b;
	
	return sum; 
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a:");
		int a= sc.nextInt();
		System.out.println("Enter b:");
		int b= sc.nextInt();
		
		ObjectDeclaration add = new ObjectDeclaration();
		int c= add.addTwoInt(a, b);
		System.out.print(c);
		


	}

}
