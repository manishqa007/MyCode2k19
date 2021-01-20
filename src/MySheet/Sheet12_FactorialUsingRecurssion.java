package MySheet;

import java.util.Scanner;

public class Sheet12_FactorialUsingRecurssion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = input.nextInt();
		int f = fact(num);
		System.out.println(f);
	}

	private static int fact(int num) {
		if (num == 1) {
			return 1;
		}
//		else {
			return fact(num - 1) * num;
//		}
	}

}
