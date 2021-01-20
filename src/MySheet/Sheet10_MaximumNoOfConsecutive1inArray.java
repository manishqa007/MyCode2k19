package MySheet;

public class Sheet10_MaximumNoOfConsecutive1inArray {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 0, 0, 1, 1, 1, 1, 0, 0 };
		int count = 0, maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
			}else if (arr[i] == 0 && maxCount < count) {
				maxCount = count;
				count = 0;
			}
		}
		System.out.println("Maximum no of consecutive 1's: " + maxCount);
	}
}
