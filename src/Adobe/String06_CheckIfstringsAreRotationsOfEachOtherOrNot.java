package Adobe;

/*
	s1 : "geeksforgeeks", s2 : "forgeeksgeeks" 
	Clearly, s2 is a rotated version of s1 as s2 can be obtained by left-rotating s1 by 5 units.
	Print 1 if s2 is a rotated version of s1; else print 0.
	Hint: String s3 = s1+s1; Now s2 will be subset of s3
*/

public class String06_CheckIfstringsAreRotationsOfEachOtherOrNot {

	public static void main(String[] args) {
		String s1 = "geeksforgeeks";
		String s2 = "forgeeksgeeks";
		String s3 = s1 + s1; // s3= geeksforgeeksgeeksforgeeks
		if (s1.length() == s2.length() && s3.contains(s2)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
