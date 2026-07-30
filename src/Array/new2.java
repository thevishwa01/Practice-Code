package Array;

public class new2 {

	public static void main(String[] args) {

		int[] a = { 1, 23, 55, 23, 664, 74 , 56};

		int max = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];

			}

		}
		System.out.println(max);

	}

}
