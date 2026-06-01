package LoopPractice;
import java.util.Scanner;

public class TableUserInput {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value to print table ");
		int n=sc.nextInt();
		int result;
		
		for(int i=1; i<=10; i++) {
			result=i*n;
			System.out.println(n+" x "+i+" = "+result);
		}
	sc.close();
		
	}

}
