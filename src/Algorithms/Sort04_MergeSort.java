package Algorithms;

public class Sort04_MergeSort {
	public static void merge(int arr[], int lb, int m, int ub) {
		// Find sizes of two sub-arrays to be merged
		int n1 = m - lb + 1;
		int n2 = ub - m;

		/* Create temp arrays */
		int Left[] = new int[n1];
		int Right[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			Left[i] = arr[lb + i];
		for (int j = 0; j < n2; ++j)
			Right[j] = arr[m + 1 + j];

		/* -------------------------Merge--------------------*/
		int i = 0, j = 0; // Initial indexes of first and second sub-arrays
		int k = lb; // Initial index of merged sub-array array
		while (i < n1 && j < n2) {
			if (Left[i] <= Right[j]) {
				arr[k] = Left[i];
				i++; 
			} else {
				arr[k] = Right[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = Left[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = Right[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using merge()
	public static void sort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2; // Find the middle point
			sort(arr, l, m); // Sort first halve
			sort(arr, m + 1, r); // Sort second halves
			merge(arr, l, m, r); // Merge the sorted halves
		}
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int x = 0; x < n; x++)
			System.out.print(arr[x]+" ");
	}

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int lb = 0;
		int ub = arr.length-1;
		sort(arr, lb, ub);
		System.out.print("Sorted array: ");
		printArray(arr);
	}
}
