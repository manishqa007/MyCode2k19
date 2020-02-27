package Revision;

import java.util.Scanner;

public class Rev06_Numeric_SumOfAllPrimeNumbersBetween1AndN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		input.close();
		sumOfAllPrimeNumbersBetween1AndN(number);
	}

	private static void sumOfAllPrimeNumbersBetween1AndN(int number) {
		System.out.print("2 ");
		int flag =1;
		for(int i = 3; i<=number;i++) {
			for (int j = 2; j <= (i/2); j++) {
				if((i%j)==0) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				System.out.print(i+" ");
			}else {
				flag=1;
			}
		}
		
	}
}
