package Adobe;

import java.util.Scanner;

public class Bits02_CountTotalSetBitsFromAllNumberFrom1ToN {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the number....");
			int number = input.nextInt();
			input.close();
			System.out.println("Bit: " + number);
			System.out.println("Set bit count method 1: " + totalSetBitCountFrom1ToN_method1 (number));
			System.out.println("Set bit count method 2: " + totalSetBitCountFrom1ToN_method2(number));
		}

		private static int totalSetBitCountFrom1ToN_method2(int number) {
			int count = 0, bits=0,temp;
			for(int i = 1; i<=number;i++) {
				temp=i;
				while(temp>0) {
					bits = temp%2;
					if(bits==1) {
						count++;
					}
					temp = temp/2;
				}
			}
			return count;
		}

		private static int totalSetBitCountFrom1ToN_method1(int num) {
			int temp,count=0;
			String tempBinary = "";
			for(int i = 1; i<=num;i++) {
				temp = i;
				while(temp>0) {
					tempBinary = temp%2 + tempBinary;
					temp = temp/2;
				}
				System.out.println("i: "+tempBinary);
				for(int j = 0;j<tempBinary.length();j++) {
					if(Character.getNumericValue(tempBinary.charAt(j))==1)
						count ++;
				}
				tempBinary= "";
			}
			return count;
		}


}
