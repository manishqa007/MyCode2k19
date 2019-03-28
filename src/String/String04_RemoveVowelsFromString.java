package String;

import java.util.Scanner;

public class String04_RemoveVowelsFromString {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to for removal of vowels: ");
		String actualString = new String();
		String expectedString_method1 = new String();
//		String expectedString_method2 = new String();
		actualString = input.nextLine();
		for (int i = 0; i < actualString.length(); i++) {
			// Method 1
			if (actualString.charAt(i) == 'a' && actualString.charAt(i) == 'A' && actualString.charAt(i) == 'e'
					&& actualString.charAt(i) == 'E' && actualString.charAt(i) == 'i' && actualString.charAt(i) == 'I'
					&& actualString.charAt(i) == 'o' && actualString.charAt(i) == 'O' && actualString.charAt(i) == 'u'
					&& actualString.charAt(i) == 'U') {
				System.out.println("actualString.charAt(i): " + actualString.charAt(i));
				expectedString_method1 = expectedString_method1 + actualString.charAt(i);
			}
			// Method 2
//			if (actualString.charAt(i) == 'a' || actualString.charAt(i) == 'A' || actualString.charAt(i) == 'e'
//					|| actualString.charAt(i) == 'E' || actualString.charAt(i) == 'i' || actualString.charAt(i) == 'I'
//					|| actualString.charAt(i) == 'o' || actualString.charAt(i) == 'O' || actualString.charAt(i) == 'u'
//					|| actualString.charAt(i) == 'U') {
//			} else {
//				expectedString_method2 = expectedString_method2 + actualString.charAt(i);
//			}
		}
		System.out.println("Method 1 String without vowels: " + expectedString_method1);
//		System.out.println("Method 2 String without vowels: " + expectedString_method2);
	}
}
