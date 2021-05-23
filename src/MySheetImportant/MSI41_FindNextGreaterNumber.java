package MySheetImportant;

import java.util.Arrays;

/*
Testcase:
	1) If all digits sorted in descending order, then output is always “Not Possible”. For example, 4321. 
	2) If all digits are sorted in ascending order, then we need to swap last two digits. For example, 1234. 
	3) For other cases, we need to process the number from rightmost side (why? because we need to find the smallest of all greater numbers)
Following is the algorithm for finding the next greater number. 
1) Traverse the given number from rightmost digit, keep traversing till you find a digit which is smaller than the previously traversed digit. For example, if the input number is “534976”, we stop at 4 because 4 is smaller than next digit 9. If we do not find such a digit, then output is “Not Possible”.
2) Now search the right side of above found digit ‘d’ for the smallest digit greater than ‘d’. For “534976″, the right side of 4 contains “976”. The smallest digit greater than 4 is 6.
3) Swap the above found two digits, we get 536974 in above example.
4) Now sort all digits from position next to ‘d’ to the end of number. The number that we get after sorting is the output. For above example, we sort digits in bold 536974. We get “536479” which is the next greater number for input 534976.
*/
public class MSI41_FindNextGreaterNumber {

	private static int generateNextGreaterNo(char num[]) {
		int i;
		boolean flag = false;
		for (i = num.length - 1; i > 0; i--) { // traverse from right to left to find smaller number than previous number
			if (num[i - 1] < num[i]) {
				flag=true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Not possible");
			return 0;
		} else {
			int x = num[i - 1], min = i;
			// II) Find the smallest digit on right side of (i-1)'th digit that is greater
			// than number[i-1]
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] > x && num[j] < num[min]) {
					min = j;
				}
			}

			// III) Swap the above found smallest digit with number[i-1]
			swap(num, i - 1, min);

			// IV) Sort the digits after (i-1)
			// in ascending order
			Arrays.sort(num, i, num.length); // will sort a]Array form index i to len-1
			System.out.print("Next number with same" + " set of digits is ");
			for (i = 0; i < num.length; i++)
				System.out.print(num[i]);
		}

		return 0;
	}

	static void swap(char ar[], int i, int j) {
		char temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}

	public static void main(String[] args) {
		char num[] = { '5', '3', '6', '9', '7', '4' };
		int nextGreaterNum = generateNextGreaterNo(num);
		System.out.println(nextGreaterNum);
	}
}
