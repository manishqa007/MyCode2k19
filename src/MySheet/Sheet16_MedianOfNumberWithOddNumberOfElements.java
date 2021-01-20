package MySheet;

import java.util.Arrays;

public class Sheet16_MedianOfNumberWithOddNumberOfElements {

	public static void main(String[] args) {
		int arr[] = {1,4,2,5,3};
		Arrays.sort(arr);
		System.out.println("Median is: "+arr[arr.length/2]);
	}

}
