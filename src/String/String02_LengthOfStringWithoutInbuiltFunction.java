package String;

import java.util.Scanner;

public class String02_LengthOfStringWithoutInbuiltFunction {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = input.nextLine();
		System.out.println("Entered string is: " + str);
		int count = 0;
		for (char c : str.toCharArray()) {
			count++;
		}
		System.out.println("Length of string is: " + count);
	}
}
