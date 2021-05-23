package Algorithms;

/*
 	Step 1: Compute sum of first window of size k 
        
  	Step 2: Compute sums of remaining windows by removing first element of previous window
  	 		and adding last element of current window. 
*/
public class Algo02_SlidingWindowAlgorithm {

	public static int slidingWindow(int A[], int len, int K) {
		int maxSum = 0;
		int tempSum = 0;
		for (int i = 0; i < K; i++) { // Step 1
			tempSum = tempSum + A[i];
		}
		maxSum=tempSum;
		for (int i = K; i < len; i++) { // Step 2
			tempSum = tempSum + A[i] - A[i - K];
			if (tempSum > maxSum) {
				maxSum = tempSum;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
		int k = 4;
		int n = arr.length;
		int res = slidingWindow(arr, n, k);
		System.out.println(res);
	}
}
