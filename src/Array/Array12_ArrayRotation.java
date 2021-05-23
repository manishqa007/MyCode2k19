package Array;

/*
==>Perform right rotation of given array twice
I/P: {1, 2, 3, 4, 5} =>After 1st rotation =>{5,1,2,3,4} => After 2nd rotation =>{4, 5, 1, 2, 3}
O/P: {4, 5, 1, 2, 3}
*/

public class Array12_ArrayRotation {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 }; 
		int noOfRoation = 2; // user INPUT==> No of time you want to rotate
		//After 1st rotation {5,1,2,3,4}
		//After 2nd rotation {4,5,1,2,3}
		int lastElement;
		for (int i = 0; i < noOfRoation; i++) {
			lastElement = arr[arr.length - 1];
			for (int j = arr.length - 1; j >= 0; j--) {
				if (j == 0)
					arr[0] = lastElement;
				else
					arr[j] = arr[j - 1];

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
