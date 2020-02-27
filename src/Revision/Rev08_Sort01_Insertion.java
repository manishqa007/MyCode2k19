package Revision;

public class Rev08_Sort01_Insertion {

	public static void main(String[] args) {
		int arr[] = { 4, 1, 5, 3, 7, 9, 2 };
		int len = arr.length;
		selectionSort(arr, len);

	}

	private static void selectionSort(int sorted[], int n) {
		int min, pos = 0;
		for (int i = 0; i < n; i++) {
			min = sorted[i];
			for (int j = i + 1; j < n; j++) {
				if (sorted[j] < min) {
					min = sorted[j];
					pos = j;
				}
			}
			sorted[pos]=sorted[i];
			sorted[i]=min;
		}

		for (int i = 0; i < sorted.length; i++) {
			System.out.print(" " + sorted[i]);
		}
	}
}
