package LoopPractice;

import java.util.Scanner;

public class ReverseDigitPractice {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int original = n;

		int result = 0;
		for (int i = 0; n > 0; i++) {
			int digit = n % 10;

			result = (result * 10) + digit;
			n = n / 10;

		}
		if (result == original) {
			System.out.println("it is palindrome");

		} else {
			System.out.println("it is not ");
		}
		System.out.println("The Reverse of " + original + " is " + result);

	}
}
