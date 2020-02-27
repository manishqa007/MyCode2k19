package Adobe;

import java.util.Scanner;

public class String05_ReverseEachWordInAGivenString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number....");
		String str = input.nextLine();
		input.close();
		System.out.println("Input String: " + str);
		reverse(str);
	}

	private static void reverse(String str) {
		String rev = "";
		int length = str.length();
		for (int i = 0; i < length; i++) {
			if (str.charAt(i) != 32) {
				rev = str.charAt(i) + rev;
			}
			if (i == length - 1 || str.charAt(i) == 32) {
				System.out.print(rev + " ");
				rev = "";
			}
		}

	}

}
