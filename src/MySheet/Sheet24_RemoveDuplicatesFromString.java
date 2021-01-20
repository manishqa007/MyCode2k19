package MySheet;

import java.util.Scanner;

// i/p: abbaabcd o/p: abcd
public class Sheet24_RemoveDuplicatesFromString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = input.nextLine();
		String newStr = new String();
		char arr[] = str.toCharArray();
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					counter++;
				}
				if (counter > 1 && arr[i] == arr[j]) {
					arr[j] = ' ';
				}
			}
			counter = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (arr[i] != ' ') {
				newStr = newStr + arr[i];
			}
		}
		System.out.println("\n" + "String without duplicate is: " + newStr);

	}

}
