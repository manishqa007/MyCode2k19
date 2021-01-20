package MySheet;

import java.util.Scanner;

public class Sheet08_FindNumberOfSquaresInNxNsquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of square");
		int sqSize = input.nextInt();
		int sqCount = 0;
		for (int i = 1; i <=sqSize; i++) {
			sqCount = (int) (sqCount + Math.pow(i, 2));
		}
		System.out.println("No of square: "+sqCount);
	}

}
