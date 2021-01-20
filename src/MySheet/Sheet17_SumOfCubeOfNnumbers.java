package MySheet;

import java.util.Scanner;

public class Sheet17_SumOfCubeOfNnumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = input.nextInt();
		int sum = cube(num);
		System.out.println("Sum of cube: "+sum);

	}

	private static int cube(int num) {
		int sum = 0;
		for(int i=1; i<=num;i++) {
			sum = (int) (sum + Math.pow(i, 3));
		}
		return sum;
	}

}
