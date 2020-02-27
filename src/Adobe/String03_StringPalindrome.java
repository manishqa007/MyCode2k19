package Adobe;

import java.util.Scanner;

public class String03_StringPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String rev = "";
		for(int i = 0; i<str.length();i++)
			rev = str.charAt(i)+rev;
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
