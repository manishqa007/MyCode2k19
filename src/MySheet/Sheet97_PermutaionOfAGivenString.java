package MySheet;

public class Sheet97_PermutaionOfAGivenString {
	public static void main(String[] args) {
		permutation("", "ABC"); //recurssion
		generatePermutation("ABC", 0, "ABC".length()); //without recurssion
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.println("===" + prefix);
			return;
		} else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}
	}
//----------------------------------------------------------------------------------
	
	// Function for generating different permutations of the string
		public static void generatePermutation(String str, int start, int end) {
			// Prints the permutations
			if (start == end - 1)
				System.out.println(">>>>>>"+str); //Printing of soln
			else {
				for (int i = start; i < end; i++) {
					// Swapping the string by fixing a character
					str = swapString(str, start, i);
					// Recursively calling function generatePermutation() for rest of the characters
					generatePermutation(str, start + 1, end);
					// Backtracking and swapping the characters again.
					str = swapString(str, start, i);
				}
			}
		}
		
		// Function for swapping the characters at position I with character at position j
		public static String swapString(String a, int i, int j) {
			char[] b = a.toCharArray();
			char ch;
			ch = b[i];
			b[i] = b[j];
			b[j] = ch;
			return String.valueOf(b);
		}
}