package Misclleneous;

import java.util.Scanner;

public class Misc07_PrintFibonacciSeries {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number....");
		int number = input.nextInt();
		input.close();
		System.out.println("Number: " + number);
		fib(number);
		
		System.out.println("With recurssion: "+recurssionfibNo(number));

	}

	private static int recurssionfibNo(int num) {
		if (num <= 1) {
			return 1;
		}
		 return recurssionfibNo(num - 1) + recurssionfibNo(num - 2);
		
	}

	private static void fib(int number) {
		int S1,S2,Sn;
		S1=0;
		S2=1;
		System.out.print(S1+" "+S2+" ");
		for(int i=2; i<number;i++) {
			Sn = S1+S2;
			S1=S2;
			S2=Sn;
			System.out.print(Sn+" ");
		}
		System.out.println();
		
	}

}
