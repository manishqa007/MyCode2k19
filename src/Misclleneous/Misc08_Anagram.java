package Misclleneous;

import java.util.Arrays;

/*
Task: Check whether two given strings are anagram of each other or not.
1) i/p: "geeksforgeeks" "forgeeksgeeks" O/P: YES
2) i/p: "allergy" "allergic" O/P: NO
*/

public class Misc08_Anagram {
	public static void main(String[] args) {
		String str1 = "geeksforgeeks";
		String str2 = "forgeeksgeeks";

		System.out.println("Method 1 [Complexity: O(n)]-------------------------------");
		if (anagramCheckMethod2UsingAscciValueSum(str1, str2))
			System.out.println("YES anagram");
		else
			System.out.println("NOT anagram");

		System.out.println("Method 2 [Complexity: O(n)]-------------------------------");
		if (anagramCheckMethod1(str1, str2))
			System.out.println("YES anagram");
		else
			System.out.println("NOT anagram");

		System.out.println("Method 3 [Complexity: O(nlon)]-------------------------------");
		if (anagramCheckMethod3UsingSorting(str1, str2))
			System.out.println("YES anagram");
		else
			System.out.println("NOT anagram");

	}

	private static boolean anagramCheckMethod1(String str1, String str2) {
		// TC-1: If two strings have different length
		if (str1.length() != str2.length())
			return false;

		// TC-2: To store the XOR value
		int value = 0;
		for (int i = 0; i < str1.length(); i++) {
			value = value ^ (int) str1.charAt(i);
			value = value ^ (int) str2.charAt(i);
		}
		
		return value == 0; // Will return true or false
	}

	private static boolean anagramCheckMethod2UsingAscciValueSum(String str1, String str2) {
		int sumStr1 = 0, sumStr2 = 0;
		// TC-1: If two strings have different length
		if (str1.length() != str2.length())
			return false;
		// TC-2: If two strings have same length
		else {
			for (int i = 0; i < str1.length(); i++) {
				sumStr1 = sumStr1 + str1.charAt(i);
				sumStr2 = sumStr2 + str2.charAt(i);
			}
			if (sumStr1 == sumStr2)
				return true;
			else
				return false;
		}
	}

	private static boolean anagramCheckMethod3UsingSorting(String str1, String str2) {
		// TC-1: If two strings have different length
		if (str1.length() != str2.length())
			return false;

		// TC-2: If two strings have same length
		char chStr1[] = str1.toCharArray();
		char chStr2[] = str2.toCharArray();
		Arrays.sort(chStr1);
		Arrays.sort(chStr2);

		for (int i = 0; i < str1.length(); i++) {
			if (chStr1[i] != chStr2[i])
				return false;
		}
		return true;
	}
}
