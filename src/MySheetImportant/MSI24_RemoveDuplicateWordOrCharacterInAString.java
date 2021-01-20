package MySheetImportant;

public class MSI24_RemoveDuplicateWordOrCharacterInAString {

	public static void main(String[] args) {
		removeDuplicateWord_method1("Manish is is good is Manish Manish"); // o/p: Manish is good
		removeDuplicateWord_method2("Manish is is good is Manish Manish"); // o/p: Manish is good
		removeDuplicateCharacter("maanmish");
	}

	private static void removeDuplicateWord_method1(String str) {
		String temp = "";
		String strArr[] = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] != null) {
				for (int j = i + 1; j < strArr.length; j++) {
					if (strArr[i].equals(strArr[j])) {
						strArr[j] = null;
					}
				}
			}
		}
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] != null) {
				temp = temp + strArr[i]+" ";
			}
		}
		System.out.println(temp);
	}

	private static void removeDuplicateWord_method2(String str) {
		String temp = "";
		boolean flag;
		String strArr[] = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			flag = true;
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[i].equals(strArr[j])) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				temp = strArr[i] + " " + temp;
			}
		}
		System.out.println(temp);
	}

	private static void removeDuplicateCharacter(String str) {
		String temp = "";
		boolean flag;
		char chArr[] = str.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			flag = true;
			for (int j = i + 1; j < chArr.length; j++) {
				if (chArr[i] == (chArr[j])) {
					flag = false;

				}
			}
			if (flag == true) {
				temp = temp + chArr[i];
			}
		}
		System.out.println(temp);

	}

}
