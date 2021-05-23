package String;

import java.util.Scanner;

public class String04_RemoveVowelsFromString {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to for removal of vowels: ");
		String actualString = new String();
		String expectedString = new String();
		actualString = input.nextLine();
		for (int i = 0; i < actualString.length(); i++) {
			if (actualString.charAt(i) != 'a' && actualString.charAt(i) != 'A' && actualString.charAt(i) != 'e'
					&& actualString.charAt(i) != 'E' && actualString.charAt(i) != 'i' && actualString.charAt(i) != 'I'
					&& actualString.charAt(i) != 'o' && actualString.charAt(i) != 'O' && actualString.charAt(i) != 'u'
					&& actualString.charAt(i) != 'U') {
				expectedString = expectedString + actualString.charAt(i);
			}
		}
		System.out.println("Method 2 String without vowels: " + expectedString);
	}
}
