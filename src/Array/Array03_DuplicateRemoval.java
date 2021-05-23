package Array;

//Given array is sorted

public class Array03_DuplicateRemoval {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 3, 3, 6 };
		int length = arr.length;
		removeDuplicate_method1(arr, length);
		System.out.println();
		removeDuplicate_method2(arr, length);

	}

	private static void removeDuplicate_method1(int[] arr, int length) {
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					break;
				} else if (arr[i] != arr[j]) {
					System.out.print(arr[i] + " ");
					break;
				}
			}
			if (i == arr.length - 2) {
				System.out.print(arr[i + 1] + " ");
			}
		}
	}

	private static void removeDuplicate_method2(int[] arr, int n) {
		// Return, if array is empty or contains a single element
		if (n == 0 || n == 1) {
			System.out.println("Array comntain 0  or 1 element");
			return;
		}

		int[] temp = new int[n];
		int j = 0; // this is for temp arr
		// Start traversing elements
		for (int i = 0; i < n - 1; i++) {
			// If current element is not equal to next element then store that currentelement
			if (arr[i] != arr[i + 1])
				temp[j++] = arr[i];
		}
		// ****(Imp condition)Store the last element as whether it is unique or repeated, it hasn't stored previously
		temp[j++] = arr[n - 1];

		// Modify original array and print
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
			System.out.println(arr[i]);
		}

	}
}