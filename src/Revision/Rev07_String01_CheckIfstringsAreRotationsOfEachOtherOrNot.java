package Revision;

public class Rev07_String01_CheckIfstringsAreRotationsOfEachOtherOrNot {
	public static void main(String[] args) {
		String s1 = "geeksforgeeks";
		String s2 = "forgeeksgeeks";
		String s3 = s1 + s1;
		System.out.println("s3: " + s3);
		if (s1.length() == s2.length() && s3.contains(s2)) {
			System.out.println("Rotation");
		} else {
			System.out.println("No rotation");
		}
	}
}
