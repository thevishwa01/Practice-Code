package PRacticeTaskforCodingAssesment;

public class ReversingtheString {
	public static void main(String[] args) {

		int orginal = 121;
		int num = orginal;
		int result = 0;

		for (int i = 0; num > 0; i++) {

			int digit = num % 10;
			result = (result * 10) + digit;
			num = num / 10;

		}
		if (result == orginal) {
			System.out.println("It is Palindrome ");

		} else {
			System.out.println("It is not");
		}

	}
}
