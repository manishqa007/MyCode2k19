package Array;

/*
Find maximum sum by removing least sum of a given number in an array
i/p: {1,1,3}, o/p:3=> Remove all 1 from array i.e, {3}
i/P: {1,1,3,3,2,2,1,1,1}, o/p:11=> Remove all 2 from array i.e, {1,1,3,3,1,1,1}
*/
public class Array04_RemoveAllOccuranceOfElementForMaxSum {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 1, 1, 2, 2, 2, 3, 3,3, 4,5 }; // sort if not sorted
		int maxSum, minElementSum, temp;
		maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
			maxSum = maxSum + arr[i];
		}
		minElementSum = maxSum;
		System.out.println("Total sum: " + maxSum);
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					temp = temp + arr[j];
				} else {
					i = j - 1;
					break;
				}
			}

			System.out.println("temp: "+temp);
			System.out.println("minElementSum: "+minElementSum);
			if (temp < minElementSum) {
				minElementSum = temp;
				temp = 0;
			}
		}

		System.out.println("Final minElementSum: "+minElementSum);
		System.out.println("Max sum: " + (maxSum - minElementSum));
	}
}
