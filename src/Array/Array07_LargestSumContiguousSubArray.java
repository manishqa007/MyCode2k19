package Array;

public class Array07_LargestSumContiguousSubArray { // Using Kadane

	public static void main(String[] args) {
		int arr[] = {1, 5, -1, 0, 10};
		int len = arr.length;
		int currentSum=0;
		int maxSum = 0;
		for(int i=0; i<len;i++) {
			currentSum= currentSum + arr[i];
			if(currentSum>maxSum)
				maxSum=currentSum;
			if(currentSum<0)
				currentSum = 0;
		}
		System.out.println(maxSum);

	}

}
