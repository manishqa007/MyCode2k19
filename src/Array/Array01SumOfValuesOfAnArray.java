package Array;

public class Array01SumOfValuesOfAnArray {

	public static void main(String[] args) {
		int sum = 0;
		int arr[] = { 4, 9, 5, 2, 6 };
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of array: " + sum);

	}

}
