package String;

import java.util.Scanner;

//i/p: "AABBCCA"
//o/p: a 3 b 2 c 2
public class String21_CharacterCountInAString {

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
				System.out.print(j + " " + count+" ");
			}
		}
	}

}
