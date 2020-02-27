package Misclleneous;

import java.util.Scanner;

public class Misc10_PrintPrimeNumberBetweenTwoGivenNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int n1 = input.nextInt();
		System.out.println("Enter 2nd number: ");
		int n2 = input.nextInt();
		System.out.println("n1: "+n1+" n2: "+n2);
		input.close();
		printAllPrimeNumberbetwwenTwoGivenNo(n1, n2);
	}

	private static void printAllPrimeNumberbetwwenTwoGivenNo(int n1, int n2) {
		boolean flag;
		for (int num = n1; num <= n2; num++) {
			flag = true;
			for (int n = 2; n <=num/2; n++) {
				if (num % n == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true && num!=1)
				System.out.print(num+" ");
		}
	}

}
