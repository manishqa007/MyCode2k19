package MySheet;

import java.util.Scanner;

public class Sheet04_LengthOfStringWithoutInbuiltFunction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		System.out.println("Enter str: ");
		str = input.next(); 
		
		method1(str); // using for each loop
	}



	private static void method1(String str) {
		int length = 0;
		char ch[] = str.toCharArray();
		for(char x: ch){
			length++;
		}
		System.out.println("Length of string: "+length);
	}
	
}
