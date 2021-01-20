package MySheetImportant;

public class MSI19_FindMissingAndRepeatedNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 5 };
		int len = arr.length;
		int sum = len * (len + 1) / 2;

		int repeatedNo = 0, sumWithoutRepeatedNo = 0;
		boolean flag = true;
		for (int i = 0; i < len; i++) {

			if (arr[i] != repeatedNo) {
				sumWithoutRepeatedNo = sumWithoutRepeatedNo + arr[i];
			}

			if (flag) {
				for (int j = i + 1; j < len; j++) {
					if (arr[i] == arr[j]) { // for finding repeated no
						repeatedNo = arr[i];
						flag = false;
						break;
					}
				}
			}
			
		}
		System.out.println("Repeated no is: " + repeatedNo);
		System.out.println("Sum without repeated no is: " + sumWithoutRepeatedNo);
		System.out.println("Missing no is: " + (sum - sumWithoutRepeatedNo));
	}
}
