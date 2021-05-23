package Algorithms;

public class Sort04_Revision {
	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int x = 0; x < n; x++)
			System.out.print(arr[x] + " ");
	}

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int lb = 0;
		int ub = arr.length - 1;
		sort(arr, lb, ub);
		System.out.print("Sorted array: ");
		printArray(arr);
	}

	private static void sort(int[] arr, int lb, int ub) {
		if (lb < ub) {
			int mid = (lb + ub) / 2;
			sort(arr, lb, mid);
			sort(arr, mid + 1, ub);
			merge(arr, lb, mid, ub);
		}

	}

	private static void merge(int[] arr, int lb, int mid, int ub) {
		int n1 = mid-lb+1;
		int n2 = ub -mid;
		int L[] = new int[n1];
		int R[] = new int[n1];

	}
}
