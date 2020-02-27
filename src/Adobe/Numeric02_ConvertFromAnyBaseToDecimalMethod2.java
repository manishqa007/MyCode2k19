package Adobe;

import java.util.Scanner;

public class Numeric02_ConvertFromAnyBaseToDecimalMethod2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the non-decimal number: ");
		int number = input.nextInt();
		System.out.println("Enter the base: ");
		int base = input.nextInt();
		input.close();
		System.out.println("Non-binary number: " + number + "| Base: " + base);
		System.out.println("Decimal: " + decimalConvertar(number, base));
	}

	private static double decimalConvertar(int number, int base) {
		int tempNum =number,pow=0;
		double decimal=0;
		while (tempNum>0) {
			decimal = decimal+(tempNum%10)*Math.pow(base, pow);
			tempNum = tempNum/10;
			pow++;
		}
		return decimal;
	}
}
