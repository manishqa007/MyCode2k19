package String;

import java.util.Scanner;

public class String03_Palindrome {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to check palindrome: ");
		String str, rev = "";
		str = input.nextLine();
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		if (rev.equals(str)) {
			System.out.println(str + " is palindroe");
		} else {
			System.out.println("Not palindrome " + rev);
		}

	}
}
