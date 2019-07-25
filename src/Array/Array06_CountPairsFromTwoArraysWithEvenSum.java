package Array;

/*
	Input: A[] = {9, 14, 6, 2, 11}, B[] = {8, 4, 7, 20}
	Output: 4
	{9, 7}, {14, 8}, {6, 4} and {2, 20} are the valid pairs.
	
	Input: A[] = {2, 4, 6}, B[] = {8, 10, 12}
	Output: 3
*/

public class Array06_CountPairsFromTwoArraysWithEvenSum {

	public static void main(String[] args) {
		int A[] = { 9, 14, 6, 2, 11 };
		int B[] = { 8, 4, 7, 20 };
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if ((B[j] != -1) && ((A[i] + B[j]) % 2 == 0)) {
					count++;
					B[j] = -1;
					break;
				}
			}

		}
		System.out.println("Count of pairs of two arrays with even Sum: "+count);

	}

}
