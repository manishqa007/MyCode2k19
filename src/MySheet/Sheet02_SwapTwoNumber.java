package MySheet;

import java.util.Scanner;

public class Sheet02_SwapTwoNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		System.out.println("Enter a: ");
		a = input.nextInt(); // 5
		System.out.println("Enter b: ");
		b = input.nextInt(); // 7
		input.close();
		System.out.println("Actual a: " + a + " b: " + b);
		method1(a, b); // Using Arithmetic Operators - sum & subtraction
		method2(a, b); // Using Arithmetic Operators - multiply & divide
		method3(a, b); // Using Bitwise XOR
	}

	private static void method1(int a, int b) {
		a = b - a; // a=2, b=7
		b = b - a; // a=2, b=5
		a = a + b;
		System.out.println("Reverse a: " + a + " b: " + b);
	}
	
	private static void method2(int a, int b) {
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("Reverse a: " + a + " b: " + b);
	}
	
	private static void method3(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("Reverse a: " + a + " b: " + b);

	}

}
