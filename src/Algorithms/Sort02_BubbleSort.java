package Algorithms;

public class Sort02_BubbleSort {


	public static void main(String[] args) {
		int arr[] = {4,1,5,3,7,9,2};
		int len = arr.length;
		selectionSort(arr, len);

	}

	private static void selectionSort(int sorted[], int n) {
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i-1; j++) { // Number of pass
				if(sorted[j]>sorted[j+1]) {
					temp = sorted[j+1];
					sorted[j+1]=sorted[j];
					sorted[j] =temp; 
				}
			}
		}
		
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i]+" ");
		}
	}

}
