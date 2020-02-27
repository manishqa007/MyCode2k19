package Algorithms;

public class Sort03_InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 4, 1, 5, 3, 7, 9, 2 };
		int len = arr.length;
		selectionSort(arr, len);

	}

	private static void selectionSort(int sorted[], int n) {
		int temp,position;
		for (int i = 1; i < n; i++) {
			position = i;
			temp = sorted[i];
			for (int j = i-1; j >=0; j--) { // Number of pass
				if(sorted[j]>temp) {
					sorted[position]=sorted[j];
					position=j;
				}
			}
			sorted[position]=temp;
		}

		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}
	}
}