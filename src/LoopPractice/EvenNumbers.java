package LoopPractice;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Sum = 0;
		for (int i = 0; i <= n; i++) {

			Sum += i;

		}
		System.out.println(Sum);

	}

}
