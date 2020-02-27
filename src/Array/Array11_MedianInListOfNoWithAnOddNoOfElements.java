package Array;

public class Array11_MedianInListOfNoWithAnOddNoOfElements {

	public static void main(String[] args) {
		int arr[] = { 3, 31, 2, 6, 12, 5, 13 };
		arr = selectionSort(arr);// For sorting of above array
		for (int x : arr)
			System.out.print(x + " ");
		median(arr);
	}

	private static int[] selectionSort(int[] arr) {
		int temp, min;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}

	private static void median(int[] arr) {
		int medianIndex =  arr.length/2;
		System.out.println("\nPosition of median is: "+(medianIndex+1)+" and median is: "+arr[medianIndex]);
		
	}

}
