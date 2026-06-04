package WhileLoopPractice;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		s=s.replaceAll("[^a-zA-z0-9]","").toLowerCase();
		String original = s;
		String Reverse = "";
		int i = s.length() - 1;
		while (i >= 0) {

			Reverse = Reverse + s.charAt(i);

			i--;
			
		}if (Reverse.equals(original)) {
			System.out.println(original+" It is Palindrome");
		}else {
			System.out.println(original+" It is not a Palindrome");
		}

	}
}
