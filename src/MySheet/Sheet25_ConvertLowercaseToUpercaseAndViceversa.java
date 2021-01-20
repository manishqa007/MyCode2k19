package MySheet;

import java.util.Scanner;

public class Sheet25_ConvertLowercaseToUpercaseAndViceversa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = input.nextLine();
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				newStr = newStr + (char) (str.charAt(i) + 32);

			} else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				newStr = newStr + (char) (str.charAt(i) - 32);
			}else {
				newStr = newStr + str.charAt(i);
			}
		}
		System.out.println(newStr);
	}
}
