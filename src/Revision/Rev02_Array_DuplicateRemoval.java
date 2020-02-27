package Revision;

public class Rev02_Array_DuplicateRemoval {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 3, 3 };
		int x = 0;
		int len = arr.length;
		for (int i = x + 1; i < len; i++) {
			if (arr[x] != arr[i]) {
				System.out.print(arr[x] + " ");
				x = i;
				if (i == len - 1) {
					System.out.print(arr[x] + " ");
				}
			} else if (i == len - 1 && arr[x] == arr[i]) {
				System.out.print(arr[x] + " ");
			}
		}
	}
}
