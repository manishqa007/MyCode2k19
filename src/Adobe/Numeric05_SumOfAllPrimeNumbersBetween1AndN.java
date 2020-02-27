package Adobe;

import java.util.Scanner;

public class Numeric05_SumOfAllPrimeNumbersBetween1AndN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		input.close();
		sumOfAllPrimeNumbersBetween1AndN(number);
	}

	private static void sumOfAllPrimeNumbersBetween1AndN(int num) {
		int primeSum = 0;
		int count = 0;
		for(int i=2; i<=num;i++) {
			count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
					if(count>=1) {
						break;
					}
				}
			}
			if(count==0) {
				System.out.println("i: "+i);
				primeSum+=i;
			}
		}
		System.out.println("Sum of all prime numbers between 1 and N: "+primeSum);
	}
}
