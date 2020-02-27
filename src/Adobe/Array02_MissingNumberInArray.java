package Adobe;

import java.util.Scanner;

public class Array02_MissingNumberInArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("In the given array find the missung number");
		int arr[]= {1,2,3,4,5,6,7,8,10};
		int n = arr.length;
		int totalSum = (n+1)*((n+1)+1)/2 ; // Sum of first n natural numbers= n(n+1)/2
		int arrSum = 0;
		for(int i = 0; i<n;i++) {
			arrSum += arr[i];
		}
		System.out.println("Missing num of array is: "+(totalSum-arrSum));
	}
}
