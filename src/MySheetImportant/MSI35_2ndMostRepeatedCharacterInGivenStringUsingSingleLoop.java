package MySheetImportant;

public class MSI35_2ndMostRepeatedCharacterInGivenStringUsingSingleLoop {
	public static void main(String[] args) {
		String str = "geeksforgeek";
		int NO_OF_CHARS = 256;
		int[] count = new int[NO_OF_CHARS]; // for count number of occurrences of every character.
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		// Traverse through the count[] and find second highest element.
		int maxIndex = 0, secondMaxIndex = 0;
		for (int i = 0; i < NO_OF_CHARS; i++) {
			// If current element is smaller than first then update both first and second
			if (count[i] > count[maxIndex]) {
				secondMaxIndex = maxIndex;
				maxIndex = i;
			}// If count[i] is in between first and second then update second
			else if (count[i] > count[secondMaxIndex] && count[i] != count[maxIndex]) {
				secondMaxIndex = i;
			}
		}
		System.out.println((char) secondMaxIndex);
	}
}
