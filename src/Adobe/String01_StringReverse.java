package Adobe;

import java.util.Scanner;

public class String01_StringReverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str, res = "";
		str = input.nextLine();

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.print(res);
	}
}