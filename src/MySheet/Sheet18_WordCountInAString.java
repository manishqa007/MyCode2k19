package MySheet;

import java.util.Arrays;
import java.util.Scanner;

public class Sheet18_WordCountInAString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = "my name is my name is khan is";// input.next();
		String arrStr[] = str.split(" ");
		method1(arrStr);
		System.out.println("----------------------------------------------------");
		method2(arrStr); // can be improved
		method3(arrStr); // later using hash map
	}

	private static void method1(String[] arrStr) {
		int count;
		for (int i = 0; i < arrStr.length; i++) {
			count = 0;
			for (int j = 0; j < arrStr.length; j++) {
				if (arrStr[i].equals(arrStr[j])) {
					count++;
				}
			}
			System.out.println(arrStr[i] + ": " + count);
		}
	}

	private static void method2(String[] arrStr) { 
		Arrays.sort(arrStr);
		int count,i , j;
		for (i = 0; i < arrStr.length; i++) {
			count = 0;
			for (j = 0; j < arrStr.length; j++) {
				if (arrStr[i].equals(arrStr[j])) {
					count++;
				}
			}
			System.out.println(arrStr[i] + ": " + count);	
		}
	}
	
	private static void method3(String[] arrStr) {
		// TODO
		
	}

}
