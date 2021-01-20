package MySheet;

import java.util.Scanner;

public class Sheet21_RemoveBlankspaceFromString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: "); 
		String str = input.nextLine();
		String newStr = new String();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 32) {
				newStr = newStr + str.charAt(i);
			}
		}
		System.out.println("String without space: " + newStr);
	}


}
