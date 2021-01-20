package Adobe;

import java.util.Scanner;

public class String03_StringPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to check palindrome");
		String str = input.nextLine();
		String rev ="";
		for(int i = 0; i<str.length();i++)
			rev = str.charAt(i) + rev;
		
		System.out.println(str.equals(rev)?"Palindrime":"Not Palindrome");
		input.close();
	}
}
