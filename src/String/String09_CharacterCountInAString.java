package String;

import java.util.Scanner;

public class String09_CharacterCountInAString {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter the string: ");
		str = input.nextLine().toLowerCase();
		int count;
		for (char j = 'a'; j <= 'z'; j++) {
			count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (j == str.charAt(i)) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(j + " " + count);
			}
		}
	}

}
