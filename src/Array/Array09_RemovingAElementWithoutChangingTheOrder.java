package Array;

public class Array09_RemovingAElementWithoutChangingTheOrder {

	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5 };
		remove(A);

	}

	private static void remove(int arr[]) {
		int len = arr.length;
		int temp[] = new int[len - 1];
		int searchAndRemove = 5;
		int j = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i] != searchAndRemove) {
				temp[j] = arr[i];
				j++;
			}
		}
		
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
	}
}
