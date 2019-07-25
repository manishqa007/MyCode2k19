package Array;

public class Array02_LeaderInAnIntegerArray {
	public static void main(String[] args) {
		int arr[] = { 15, 19, 7, 14, 8, 6, 3, 13 };
		int flag = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					flag = 0;
					break;
				}
				flag++;
			}
			if (flag > 0) {
				System.out.println(" " + arr[i]);
			}
			if (i + 1 == arr.length - 1) {
				System.out.println(" " + arr[i + 1]);
			}
		}
	}

}
