package Misclleneous;

import java.util.Scanner;

/*
A number is a perfect number if is equal to sum of its proper divisors,
that is, sum of its positive divisors excluding the number itself.
Eg: Input: n = 6
	Output: true
	Divisors of 6 are 1, 2 and 3.
	Sum of divisors(1+2+3) is 6.
*/
public class Misc09_PerfectNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int num = input.nextInt();
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.print(i+" ");
				sum = sum + i;
			}
		}
		System.out.println("Sum: "+sum);
		if (num == sum) {
			System.out.println("Perfect number");
		} else {
			System.out.println("Not perfect number");
		}
	}
}
