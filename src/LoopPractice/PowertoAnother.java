package LoopPractice;

import java.util.Scanner;

public class PowertoAnother {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Power");
		int n = sc.nextInt();

		System.out.println("Enter the value of Base");

		int m = sc.nextInt();

		int result = 1;

		for (int i = 1; i <= n; i++) {

			result = result * m;

		}
        System.out.println(result);
	}

}
