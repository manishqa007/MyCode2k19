package Adobe;

import java.util.Scanner;
// check if number is in power on two means num =8 then 2^3= 8 that means 8 is in power of two
public class Numeric04_PowerOf2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		input.close();
		method1(number);
		System.out.println("--------------------");
		method2(number);
	}
		
		private static void method1(int number) {
			boolean flag=false;
		for(int i =0;i<number/2;i++) {
			if(Math.pow(2, i)==number) {
				System.out.println("Power of 2");
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Not power of 2");
		}	
	}

	private static void method2(int number) {
		boolean flag=false;
		int loop = (int)(Math.log(64)/Math.log(2));
		System.out.println("loop: "+loop);
		for(int i= 0; i<=loop+1;i++) {
			if(Math.pow(2, i)==number) {
				System.out.println("Power of 2");
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Not power of 2");
		}		
	}
}
