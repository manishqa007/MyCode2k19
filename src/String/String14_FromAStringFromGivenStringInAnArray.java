package String;

public class String14_FromAStringFromGivenStringInAnArray {// Using 1st char of every word
	public static void main(String[] args) {
		String str[] = { "Manish", "Ankita", "Bijendra", "Pradeep", "Rishabh" };
		String newString = "";
		for (int i = 0; i < str.length; i++) {
			newString = newString + str[i].charAt(i);
		}
		System.out.println(newString);
	}
}
