package Adobe;

import java.util.Scanner;

//Link: https://www.geeksforgeeks.org/program-to-find-whether-a-no-is-power-of-two/
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
		System.out.println("--------------------");
		method3(number);/*(Imp logic)
						 * If we subtract a power of 2 numbers by 1 then all unset bits after the only
						 * set bit become set; and the set bit becomes unset. For example for 4 ( 100)
						 * and 16(10000), we get the following after subtracting 1 
						 * 3 –> 011 
						 * 15 –> 01111
						 */
		method4(number); /* (Imp logic)
					 * All power of two numbers has only a one-bit set. So count the no. of set bits
					 * and if you get 1 then the number is a power of 2. Please see Count set bits
					 * in an integer for counting set bits.
					 */

	}

	private static void method4(int num) {
     // count the set bit here, if it is one only then it is power of one
	}

	private static void method1(int number) {
		boolean flag = false;
		for (int i = 0; i < number / 2; i++) {
			if (Math.pow(2, i) == number) {
				System.out.println("Power of 2");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Not power of 2");
		}
	}

	private static void method2(int number) {
		System.out.println("???????????");
		boolean flag = false;
		int loop = (int) (Math.log(64) / Math.log(2));
		System.out.println("loop: " + loop);
		for (int i = 0; i <= loop + 1; i++) {
			if (Math.pow(2, i) == number) {
				System.out.println("Power of 2");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Not power of 2");
		}
	}

	public static void method3(int x) {
		/* First x in the below expression is for the case when x is 0 */
		boolean res = x != 0 && ((x & (x - 1)) == 0);

		System.out.println(res ? "Yes" : "No");

	}
}
