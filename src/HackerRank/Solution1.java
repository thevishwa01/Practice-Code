package HackerRank;

import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();

			int total = a;
			for (int j = 0; j < n; j++) {
				total = total + b;

				System.out.print(total);
				b = b * 2;
				if (j < n - 1) {
					System.out.print(" ");

				}

			}
			System.out.println();
		}

	}

}
