package Adobe;

import java.util.Scanner;

public class Numeric02_ConvertFromAnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the non-decimal number: ");
		String number = input.nextLine();
		System.out.println("Enter the base: ");
		int base = input.nextInt();
		input.close();
		System.out.println("Non-binary number: " + number + "| Base: " + base);
		System.out.println("Decimal: " + decimalConvertar(number, base));
	}

	public static int decimalConvertar(String num, int base) {
		int decimal = 0, temp = 0, pow = 0;
		char ch;
		for (int i = num.length() - 1; i >= 0; i--) {
			if (num.charAt(i) >= 65 && num.charAt(i) <= 97) {
				ch = (char) (num.charAt(i) - 55);
				temp = (int) ch;
			} else {
				temp = Character.getNumericValue(num.charAt(i));
			}
			System.out.println("temp: " + temp);
			decimal = decimal + (int) (temp * Math.pow(base, pow));
			pow++;
		}
		return decimal;
	}
}
