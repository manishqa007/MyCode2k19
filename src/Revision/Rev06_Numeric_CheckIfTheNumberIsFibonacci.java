package Revision;

import java.util.Scanner;

public class Rev06_Numeric_CheckIfTheNumberIsFibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number....");
		int number = input.nextInt();
		input.close();
		System.out.println("Number: " + number);
		fibonacci(number);
	}

	private static void fibonacci(int number) {
		int s1 = 0, s2 = 1;
		int sn = s1 + s2;
		System.out.print(s1 + " " + s2 + " ");
		if (s1 == number || s2 == number) {
			System.out.println(number + " is fibonacci");
		} else {
			while (s2 < number) {
				sn = s1 + s2;
				if (sn == number) {
					System.out.println(number + " is fibonacci");
					break;
				}
				System.out.print(sn + " ");
				s1 = s2;
				s2 = sn;
			}
		}
	}

}
