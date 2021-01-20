package MySheet;

import java.util.Scanner;

public class Sheet11_PalindromeOfAStringOrNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string or num to check palindrome: ");
		String str = input.next();
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev ;
		}
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
}
