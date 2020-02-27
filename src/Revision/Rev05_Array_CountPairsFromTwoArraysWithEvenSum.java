package Revision;

public class Rev05_Array_CountPairsFromTwoArraysWithEvenSum {

	public static void main(String[] args) {
		int A[] = { 9, 14, 6, 2, 11 };
		int B[] = { 8, 4, 7, 20 };

//		int resultNN = countPairsFromTwoArraysWithEvenSumNN(A, B); // O(n^2)
		int resultN = countPairsFromTwoArraysWithEvenSumN(A, B); // // O(n)
		System.out.println("Count of pairs from two arrays with even sum: "+resultN);
	}

	private static int countPairsFromTwoArraysWithEvenSumNN(int[] a, int[] b) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if ((a[i] + b[j]) % 2 == 0 && (b[j] != -1)) {
					System.out.println("{" + a[i] + "," + b[j] + "}");
					count++;
					b[j] = -1;
					break;
				}
			}
		}
		return count;
	}

	private static int countPairsFromTwoArraysWithEvenSumN(int[] a, int[] b) {
		int odd1 = 0, even1 = 0;
		int odd2 = 0, even2 = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even1++;
			} else {
				odd1++;
			}
		}
		System.out.println(even1 + " " + odd1);

		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0) {
				even2++;
			} else {
				odd2++;
			}
			
		}
		System.out.println(even2 + " " + odd2);
		return (Math.min(odd1, odd2) + Math.min(even1,even2));
	}
}
