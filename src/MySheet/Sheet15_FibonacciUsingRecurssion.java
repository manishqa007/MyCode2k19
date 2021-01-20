package MySheet;

import java.util.Scanner;

public class Sheet15_FibonacciUsingRecurssion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = input.nextInt();
		int fib = fibonacci(num);
		System.out.println(fib);
	}

	private static int fibonacci(int num) {
		if (num <= 1)
			return 1;
		else
			return fibonacci(num - 1) + fibonacci(num - 2);
	}

}
