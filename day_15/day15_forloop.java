package company.com;
import java.util.Scanner;
public class day15_forloop {
public static void main(String[] args) throws InterruptedException{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the starting number");
	int num1=obj.nextInt();
    System.out.println("Enter the second number");
    int num2=obj.nextInt();
    
    for(int i=num1;i<=num2;i++) {
    	if(i%4==0) {
    		System.out.print(i+" ");
    	}
    }
    
}
}
