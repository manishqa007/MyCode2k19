package Algorithms;

public class Sort01_SelectionSort {

	public static void main(String[] args) {
		int arr[] = {4,1,5,3,7,9,2};
		int len = arr.length;
		selectionSort(arr, len);

	}

	private static void selectionSort(int sorted[], int n) {
		int minIndex;
		for(int i=0;i<n;i++) {
			minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(sorted[j]<sorted[minIndex]) {
					minIndex = j;
				}
			}
			int temp = sorted[minIndex];
			sorted[minIndex]=sorted[i];
			sorted[i]=temp;
		}
		
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(" "+sorted[i]);
		}
	}
}
