package String;

import java.util.Scanner;

public class String25_PrintDigitInWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = input.nextInt();
		// 200 = two hundred [done]
		// 250 = two hundred fifty [done]
		// 205 = two hundred and five [done]
		// 251 = two hundred fifty one [done]
		
		int tempNum = num;
		int firstDigit, secondDigit, thirdDigit;
		String ones="",tens="",hund="";
		thirdDigit = tempNum % 10;
		tempNum = tempNum / 10;
		secondDigit = tempNum % 10;
		tempNum = tempNum / 10;
		firstDigit = tempNum;

		System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit);
		String digit[] = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
		String digitValue[] = { "ten", "twenty", "thiry", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty",
				"hundred" };
		if (num % 100 == 0) { // TC-1
			for (int i = 1; i <= 9; i++) {
				if (i == firstDigit) {
					System.out.println(digit[i - 1] + " " + digitValue[9]);
				}
			}
		} else if ((num % 100 != 0) && (num % 10 == 0)) { // TC-2
			for (int i = 1; i <= 9; i++) {
				if (i == firstDigit) 
					hund = digit[i - 1];
				
				if(i==secondDigit) 
					tens = digitValue[i-1];
			}
			System.out.println(hund+" "+digitValue[9]+" "+tens);
		}else if (firstDigit!=0 && secondDigit==0 & thirdDigit!=0) { // TC-3
			for (int i = 1; i <= 9; i++) {
				if (i == firstDigit) 
					hund = digit[i - 1];
				
				if(i==thirdDigit) 
					ones = digit[i-1];
			}
			System.out.println(hund+" "+digitValue[9]+" "+ones);
		}else if (firstDigit!=0 && secondDigit!=0 & thirdDigit!=0) { // TC-3
			for (int i = 1; i <= 9; i++) {
				if (i == firstDigit) 
					hund = digit[i - 1];
				
				if(i==secondDigit) 
					tens = digitValue[i-1];
				
				if(i==thirdDigit) 
					ones = digit[i-1];
			}
			System.out.println(hund+" "+digitValue[9]+" "+tens+" "+ones);
		}
		input.close();
	}
}