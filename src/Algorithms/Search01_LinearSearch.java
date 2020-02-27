package Algorithms;

public class Search01_LinearSearch {

	public static void main(String[] args) {

		int arr[] = { 5, 7, 1, 9, 8 };
		int search,flag;
		search= 9;
		flag = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				System.out.println("Number: " + search + " found at position: " + (i + 1));
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Number not present in given array");
		}
	}

}
