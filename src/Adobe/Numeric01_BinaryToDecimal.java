package Adobe;

import java.util.Scanner;

public class Numeric01_BinaryToDecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int binaryNum = input.nextInt();
		int length = String.valueOf(binaryNum).length();
		int temp = binaryNum;
		int decimal = 0;
		System.out.println("binary: "+binaryNum);
		int pow = 0;
		for(int i = length-1;i>=0;i--) {
//			System.out.println("decimal: "+decimal+" (int)binary.charAt(i): "+binary.charAt(i)+": Math.pow(2, pow) "+Math.pow(2, pow));
			decimal = (int) (decimal + (temp%10)*Math.pow(2, pow));
			System.out.println("decimal: "+decimal);
			pow++;
		}
		System.out.println(decimal);
	}
}
