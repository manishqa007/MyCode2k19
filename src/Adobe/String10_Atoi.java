package Adobe;

import java.util.Scanner;

public class String10_Atoi {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the string you want to convert to int::");
			String inputString = scanner.next();
			System.out.println("String Before Conversion in int:" + inputString);
			System.out.println(inputString.charAt(1));
			int intOutput = convertStringToInt(inputString);
			System.out.println("String After Conversion in int:" + intOutput);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int convertStringToInt(String inputString) {
		int start = 0;
		int number = 0;
		boolean isNegative = false;
		int len = inputString.length();

		// Check if number is negative then make isNegative flag true
		if (inputString.charAt(0) == '-') {
			isNegative = true;
			start = 1;
		} else if (inputString.charAt(0) == '+') {
			start = 1;
		} // You can give other conditions also.....

		for (int i = start; i < len; i++) {
//			System.out.println("ASCCI of inputString.charAt(si): "+(int)inputString.charAt(i)); // This will print ASCCI value
			number = number * 10;
			number = number + (inputString.charAt(i) - '0'); // This will also print ASCCI value but after manipulation
																// i.e, ASCCI of '0'=48 and ASCCI of '6' = 54, so 54-48
																// = 6
		}
		// if number is negative again prefix with negative sign
		if (isNegative) {
			number = -number;
		}
		return number;
	}
}
