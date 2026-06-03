package LoopPractice;
import java.util.Scanner;
public class Cube {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to Get Cube upto");
		int n=sc.nextInt();
		int cube=0;
		for(int i=1;i<=n;i++) {
			cube=i*i*i;
			
			System.out.println("Number is : "+i+" and Cube of "+i+" is : "+cube);
			
		}
		
		sc.close();
		
		
	}

}
