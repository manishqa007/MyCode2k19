package MySheetImportant;

public class MSI16_MedianOfListWithOddNumber {

	public static void main(String[] args) {
		int arr[] = { 3, 3, 5, 9, 11 }; //sorted
		int index = ((arr.length-1) + 1) / 2;
		System.out.println("Median of num: " + arr[index]);
	}
}
