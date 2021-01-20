package Algorithms;

public class Sort09_CountingSort {

	public static void main(String args[]) {
		char arr[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's' };
		sort(arr);
		System.out.print("Sorted character array is ");
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i]);
	}

	static void sort(char arr[]) {
		int n = arr.length;
		char output[] = new char[n]; // The output character array that will have sorted arr
		int count[] = new int[256]; // Create a count array to store count of individual characters and initialize count array as 0
		
//		for (int i = 0; i < 256; ++i) // no need to initialize array values with '0', since by default it is zero
//			count[i] = 0; 

		// store count of each character
		for (int i = 0; i < n; ++i)
			count[arr[i]]++;

		// Change count[i] so that count[i] now contains actual position of this character in output array
		for (int i = 1; i <= 255; ++i)
			count[i] = count[i] + count[i - 1];

		// Build the output character array To make it stable we are operating in reverse order.
		for (int i = n - 1; i >= 0; i--) {
			output[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}

		// Copy the output array to arr, so that arr now contains sorted characters
		for (int i = 0; i < n; ++i)
			arr[i] = output[i];
	}
}
