package MySheet;

import java.util.Scanner;

public class Sheet20_RemoveVowelsFromString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: "); // enter in lower case
		String str = input.nextLine();
		String newStr = new String();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o'
					&& str.charAt(i) != 'u') {
				newStr = newStr + str.charAt(i);
			}

//			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
//				
//			}else {
//				newStr = newStr + str.charAt(i);
//			}
		}
		System.out.println("String without vowel: " + newStr);
	}
}
