package Adobe;

import java.util.Scanner;

public class String04_SearchAwordInGivenString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = input.nextLine();
		System.out.println("Enter the word to e searched: ");
		String search = input.nextLine();
		boolean flag = false;
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != 32) {
			temp = temp + str.charAt(i);
			}
			if (str.charAt(i) == 32 || i==str.length()-1) {
				if (temp.equals(search)) {
					System.out.println("Word exist");
					flag = true;
					break;
				}
				System.out.println("temp: "+temp);
				temp="";
			}
		}
		if (flag == false) {
			System.out.println("No such word exist in given string");
		}
	}

}
