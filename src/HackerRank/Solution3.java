package HackerRank;

import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			String s = sc.next();

			if (s.length() > 19 || (s.startsWith("-") && s.length() > 20)) {
				System.out.println(s + "can't be fitted anywhere");
			} else {
				long n = Long.parseLong(s);

				if (n >= -128 && n <= -127) {
					System.out.println(n + " can be fitted in:");
					System.out.println("* int");
					System.out.println("* short");
					System.out.println("* long");
					System.out.println("* float");
					System.out.println("* double");

				} else if (n >= -32768 && n <= 32767) {
					System.out.println(n + " can be fitted in:");
					System.out.println("* int");
					System.out.println("* long");
					System.out.println("* float");
					System.out.println("* double");

				} else if (n >= -2147483648 && n <= 2147483647) {
					System.out.println(n + " can be fitted in: ");
					System.out.println("* long");
					System.out.println("* float");
					System.out.println("* double");

				} else {
					System.out.println(n + "can't be fitted in:");
					System.out.println("* long");

				}

			}

		} sc.close();
	}
}
