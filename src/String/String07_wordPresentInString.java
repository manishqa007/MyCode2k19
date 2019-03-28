package String;

import java.util.Scanner;

public class String07_wordPresentInString {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String str = new String();
		String word = new String();
		int index = 0;
		System.out.println("Enter the string: ");
		str = input.nextLine().toLowerCase();
		System.out.println("Enter the word to be searched string: ");
		word = input.nextLine().toLowerCase();
		String strArr[] = str.split(" ");
		for (String temp : strArr) {
			System.out.println(temp+" ");
			if (word.equals(temp)) {
				System.out.println("Word is present and found at position: " + (index + 1));
				break;
			} else {
				index++;
			}
		}
	}

}
