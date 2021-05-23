package Algorithms;

// This is modified version of Kadane algo if all the number are -ve
public class Algo01a_KadaneAlgorithmForNegativeNumber {

	public static void main(String[] args) {
		int arr[] = {-8,-1, -5, -2, -3, -7};
		int len = arr.length;
		int currentSum=0;
		int maxSum =arr[0];//never initialize maxSum = 0....else max sum arr sol will be always 0 in case of all value of array are -ve 
		for(int i=0; i<len;i++) {
			currentSum = currentSum + arr[i];
			
			if(maxSum<arr[i]) { // if all element in array are -ve
				maxSum = arr[i];
			}
			if(currentSum>maxSum) {
				maxSum = currentSum;
			}
		}
		System.out.println("Maximum sub array: "+maxSum);
	}

}
