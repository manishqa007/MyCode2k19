package Algorithms;

public class Search03_BinarySearchUsingRecurssion {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9, 13, 16, 18, 24, 30 };
		int first = 0;
		int last = arr.length - 1;
		int search = 9;
		int seachedIndex = binSearch(arr, first, last, search);
		System.out.println("Index: " + seachedIndex);
	}

	public static int binSearch(int arr[], int first, int last, int search) {
		int mid;
		mid = (first + last) / 2;
		if (arr[mid] == search) {
			return mid; // if not found return mid which is the index of search
		} else if (arr[mid] > search) {
			binSearch(arr, last, mid - 1, search);
		} else {
			binSearch(arr, mid + 1, last, search);
		}

		return -1; // if not found return -1
	}
}