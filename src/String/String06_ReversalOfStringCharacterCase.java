package String;

import java.util.Scanner;

public class String06_ReversalOfStringCharacterCase {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the actual string: ");
		String actualString = new String();
		String expectedString = new String();
		actualString = input.nextLine();
		for (int i = 0; i < actualString.length(); i++) {
			if (actualString.charAt(i) >= 65 && actualString.charAt(i) <= 90) {
				expectedString = expectedString + (char) (actualString.charAt(i) + 32);
			} else if (actualString.charAt(i) >= 97 && actualString.charAt(i) <= 122) {
				expectedString = expectedString + (char) (actualString.charAt(i) - 32);
			} else {
				expectedString = expectedString + actualString.charAt(i);
			}
		}
		System.out.println("String after character case reversal: " + expectedString.toString());
	}
}
