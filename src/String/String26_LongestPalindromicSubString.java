package String;

//Link:https://www.youtube.com/watch?v=y2BD4MJqV20&t=789s
public class String26_LongestPalindromicSubString {
// solve once
	public static void main(String[] args) {
		String s = "abbabbba";
		longestPalindrom(s);
	}
//public static int c=1;
	public static String longestPalindrom(String str) {
		if (str != null && str.length() <= 1) // TC -1
			return str;
		int len = 0, len1 = 0, len2 = 0;  // TC-2
		int start = 0, end = 0;
		for (int i = 0; i < str.length(); i++) {
			len1 = expandAroundCentre(str, i, i); // racecar => acecar (odd len)
			len2 = expandAroundCentre(str, i, i + 1); // eeabbac ==> abba (even len)
			len= Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len - 1) / 2; // for finding left boundary
				end = i + len / 2;         // for finding right boundary
			}
		}
		return str.substring(start, end + 1);

	}

	private static int expandAroundCentre(String str, int left, int right) {
		while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
			left--;
			right++;
		}
		
//		System.out.println((c++)+" >"+(right - 1 - left));
		return right - 1 - left; //Return length of palindromic substring
	}
}
