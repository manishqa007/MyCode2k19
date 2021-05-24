package String;

import java.util.Scanner;

public class String03_Palindrome {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to check palindrome: ");
		String str = input.next();
		method1(str);
		method2(str); // By reversing the String using recurssion
	}

	private static void method1(String str) {
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		if (rev.equals(str)) {
			System.out.println(str + " is palindroe");
		} else {
			System.out.println("Not palindrome " + rev);
		}
	}
	

	private static void method2(String input) {
		String rev = reverse(input);
		System.out.println(rev.equals(input)?"Palindrome":"Not Palindrome");
	}

	private static String reverse(String str) {
		if(str.length()==1)
			return str;
		else
			return reverse(str.substring(1)) + str.charAt(0);			
	}
}
