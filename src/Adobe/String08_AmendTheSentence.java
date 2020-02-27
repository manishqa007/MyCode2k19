package Adobe;

/*
	Input : BruceWayneIsBatman
	Output: bruce wayne is batman
*/

public class String08_AmendTheSentence {

	public static void main(String[] args) {
		String str = "BruceWayneIsBatman";
		String strTemp = "";
		System.out.println("Input: " + str);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' && i != 0) {
				strTemp = strTemp + " " + (str.charAt(i));
			} else {
				strTemp = strTemp + str.charAt(i);
			}
		}
		System.out.println("Output: " + strTemp.toLowerCase());
	}

}
