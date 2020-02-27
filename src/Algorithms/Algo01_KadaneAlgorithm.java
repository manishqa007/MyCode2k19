package Algorithms;

/*
	NOTE: Kadane's algorithm is applicable only for array which consist of both positive and negative values.
	
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
		int A[] = {1, 5, -1, 0, 10};
		int len = A.length;
		int tempSum=0;
		int finalSum = 0;
		for(int i=0; i<len;i++) {
			tempSum = tempSum + A[i];
			if(tempSum<0) { // This is because max sum is always taken in positive
				tempSum = 0;
			}
			if(tempSum>finalSum) {
				finalSum = tempSum;
			}
		}
		System.out.println("Maximum sub array: "+finalSum);
	}

}
