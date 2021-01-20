package MySheet;

public class Sheet19_FindMissingAndRepeatedNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 5, 7 }; // repeated no is 2, missing no is 6
		int count = 0, repeatedNo = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > 1) {
				repeatedNo = arr[i];
				System.out.println("repeated no is: " + repeatedNo);
				break;
			}
		}
		// Finding the missing no
		int sum = 0;
		int totalSum = (arr.length * (arr.length + 1)) / 2;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == repeatedNo)
				continue; // For not counting the repeated no once
			sum = sum + arr[i];
		}
		System.out.println("totalSum: " + totalSum + " sum: " + sum);
		System.out.println("Missing no is: " + (totalSum - sum));
	}
}
