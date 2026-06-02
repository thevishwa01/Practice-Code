package LoopPractice;

import java.util.Scanner;

public class SumofEvenNum {
	public static void main(String[] args) {

		int count=0;
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=2;i<=n; i+=2) {
			count+=i;
		
		}
		
		System.out.println("Sum of Even Number is "+count);
	}
}
