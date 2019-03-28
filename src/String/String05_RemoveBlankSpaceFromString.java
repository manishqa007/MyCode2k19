package String;

import java.util.Scanner;

public class String05_RemoveBlankSpaceFromString {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string for blankspace removal: ");
		String actualString = new String();
		String expectedString = new String();
		actualString = input.nextLine();
		for (int i = 0; i < actualString.length(); i++) {
			if(actualString.charAt(i)!=32){
			expectedString = expectedString + actualString.charAt(i);
			}
		}
		System.out.println("String without blankspace: "+expectedString);
	}

}
