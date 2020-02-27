package Adobe;

import java.util.Scanner;

public class Bits01_CountSetBitOfAGivenNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the bits....");
		String bits = input.next();
		input.close();
		System.out.println("Bit: " + bits);
		System.out.println("Set bit count: " + setBitCount(bits));
	}

	private static int setBitCount(String bits) {
		int count = 0;
		for (int i = 0; i < bits.length(); i++) {
			if /*(bits.charAt(i) == 49)*/ (Character.getNumericValue(bits.charAt(i)) == 1)
				count++;
		}
		return count;
	}

}
