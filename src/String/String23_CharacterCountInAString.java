package String;

import java.util.Scanner;

//i/p: "AABBCCA"
//o/p: a 3 b 2 c 2
public class String23_CharacterCountInAString {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter the string: "); // "abbbccceeaagb";
		str = input.nextLine();
		method1(str.toLowerCase()); // O(N^2)
		System.out.println("=======================");
		method2(str.toLowerCase()); // O(N)
//		medhod3(str.toLowerCase());
	}

	public static void method1(String str) {
		int count;
		for (char j = 'a'; j <= 'z'; j++) {
			count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (j == str.charAt(i)) {
					count++;
				}
			}
			if (count != 0) {
				System.out.print(j + " " + count + " ");
			}
		}
	}

	public static void method2(String str) {

		int count[] = new int[256];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0)
				System.out.println((char) i + " " + count[i]);
		}
	}

}
