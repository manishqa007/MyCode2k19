package Algorithms;

public class Search03_BinarySearchUsingRecurssion {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9, 13, 16, 18, 24, 30 };
		int head = 0;
		int last = arr.length - 1;
		int search = 9;
		int result = binSearch(arr, head, last, search);
		System.out.println("Index: " + result);
	}

	public static int binSearch(int arr[], int head, int last, int search) {
		int mid;
		mid = (head + last) / 2;
		if (arr[mid] == search) {
			return mid;
		} else if (arr[mid] > search) {
			binSearch(arr, last, mid - 1, search);
		} else {
			binSearch(arr, mid + 1, last, search);
		}

		return -1;
	}
}