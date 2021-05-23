package Algorithms;

/*
	NOTE: Kadane's algorithm is applicable only for array which consist of both positive and negative values.
	Largest Sum Contiguous Subarray
	YOUTUBE LINK: https://www.youtube.com/watch?v=HCL4_bOd3-4
	
	Algorithm:
		Initialize:
		    max_so_far = 0
		    max_ending_here = 0
		
		Loop for each element of the array
		  (a) max_ending_here = max_ending_here + a[i]
		  (b) if(max_ending_here < 0)
		            max_ending_here = 0
		  (c) if(max_so_far < max_ending_here)
		            max_so_far = max_ending_here
		return max_so_far
*/
public class Algo01_KadaneAlgorithm {

	public static void main(String[] args) {
		int arr[] = {1, 5, -1, 0, 10};
		int len = arr.length;
		int currentSum=0;
		int maxSum = 0;
		for(int i=0; i<len;i++) {
			currentSum = currentSum + arr[i];
			if(currentSum<0) { // This is because max sum is always taken in positive
				currentSum = 0;
			}
			if(currentSum>maxSum) {
				maxSum = currentSum;
			}
		}
		System.out.println("Maximum sub array: "+maxSum);
	}

}
