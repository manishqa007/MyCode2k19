package Array;

//Given array is sorted

public class Array03_DuplicateRemoval {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 3, 6 };
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					break;
				} else if (arr[i] != arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
			if (i == arr.length - 2) {
				System.out.println(arr[i + 1]);
			}

		}

	}
}