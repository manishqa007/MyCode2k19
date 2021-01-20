package MySheetImportant;

public class MSI27_SmallestWordLengthInString {

	public static void main(String[] args) {
		String str = "Smallest word in String";
		String strArr[] = str.split(" ");
		int minLen = str.length(), index = 0;
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].length() < minLen) {
				minLen = strArr[i].length();
				index = i;
			}
		}
		System.out.println("min length word is: '" + strArr[index] + "' i.e, " + minLen);
	}
}
