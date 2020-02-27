package Revision;

public class Rev03_Array_RemoveAllOccuranceOfElementForMaxSum {

	public static void main(String[] args) {
		int A[] = { 1, 1, 3, 3,3, 5,5,6 };

		int sumOfArray = 0;
		for (int i = 0; i < A.length; i++) {
			sumOfArray = sumOfArray + A[i];
		}

		int result;
		result = RemoveAllOccuranceOfElementForMaxSumNN(A, sumOfArray); // O(n^2)
		System.out.println("O(n^2): " + result);
//		result = RemoveAllOccuranceOfElementForMaxSumN(A, sumOfArray); // O(n)
		System.out.println("O(n): " + result);
	}

	public static int RemoveAllOccuranceOfElementForMaxSumNN(int arr[], int sum) { // { 1, 1, 3, 3,3, 5,5,6 }
		int arrSum = sum;
		int singleElementSum = 0;
		int minSingleElementSum = 0;
		int maxSumAfterRemovalOfMin = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					singleElementSum = arr[j] + singleElementSum;
				} else if (arr[i] != arr[j]) {
					i = j;
					break;
				}
			}
			
			if ((arrSum - singleElementSum) > maxSumAfterRemovalOfMin) {
				maxSumAfterRemovalOfMin = (arrSum - singleElementSum);
				singleElementSum = 0;
			}
		}
		return maxSumAfterRemovalOfMin;
	}

	public static int RemoveAllOccuranceOfElementForMaxSumN(int arr[], int sum) {

		int arrSum = 0;
		int singleElementSum = 0;
		int minSingleElementSum = 0;
		for (int i = 0; i < arr.length; i++) {
			arrSum = arrSum + arr[i];
		}
		minSingleElementSum = arrSum;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[i + 1] && i + 1 <= arr.length - 1) {
				singleElementSum = singleElementSum + arr[i];
			} else if (arr[i] != arr[i + 1] && i == arr.length - 1) {
				singleElementSum = singleElementSum + arr[i];
				if (minSingleElementSum > singleElementSum) {
					minSingleElementSum = singleElementSum;
					System.out.println("minSingleElementSum: " + minSingleElementSum);
				}

				singleElementSum = 0;
			}
		}
		System.out.println("Max sum after removal: " + (arrSum - minSingleElementSum));
		return minSingleElementSum;
	}

}
