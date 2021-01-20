package MySheet;

import java.util.Scanner;

//6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number
public class Sheet23_FindPerfectNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = input.nextInt();
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			System.out.println(num + " is prefect number");
		} else {
			System.out.println("Number is not perfect");
		}
	}
}
