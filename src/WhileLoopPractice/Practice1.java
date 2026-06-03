package WhileLoopPractice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int original = n;

		int result = 0;

		int i = 1;
		while (i <= n) {

			int digit = n % 10;
			result = (result * 10) + digit;
			n = n / 10;

		}
		if (result == original) {
			System.out.println("It is Palindrome");

			if (result % 5 == 0) {
				System.out.println("It is Divisible by 5");

			} else {
				System.out.println("It is not Divsible by 5");
			}

		} else {
			System.out.println("It is not !");
		}

	}

}
