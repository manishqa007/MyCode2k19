package Adobe;

import java.util.Scanner;

public class Numeric03_CheckIfTheNumberIsFibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number....");
		int number = input.nextInt();
		input.close();
		System.out.println("Number: " + number);
		fibonacci(number);
	}

	private static void fibonacci(int num) {
		int S1, S2, Sn = 0;
		S1 = 0;
		S2 = 1;
		int fib = 0;
		boolean flag = false;
		System.out.print(S1 + " " + S2 + " ");
		if (num == S1 || num == S2) {
			System.out.print("Entered number is fibonacci");
		} else {
			while (S2 < num) {
				Sn = S1 + S2;
				System.out.print(Sn + " ");
				if (Sn == num) {
					System.out.print("Entered number is fibonacci");
					flag = true;
					break;
				}
				S1 = S2;
				S2 = Sn;
			}
		}
		if (flag == false)
			System.out.println("Entered number is NOT fibonacci");
	}
}
