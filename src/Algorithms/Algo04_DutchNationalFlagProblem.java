package Algorithms;

/*
Link of "Dutch national flag problem": http://users.monash.edu/~lloyd/tildeAlgDS/Sort/Flag/
Note:*Also called 3-way Partitioning
	 *Dijkstra used the Dutch National Flag Problem
Steps:
	1. If the element is 0 then swap the element with the element at index low and update low = low + 1 and mid = mid + 1
	2. If the element is 1 then update mid = mid + 1
	3. If the element is 2 then swap the element with the element at index high and update high = high – 1 and update i = i – 1. As the swapped element is not processed

*/
public class Algo04_DutchNationalFlagProblem {

	/* Driver function to check for above functions */
	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		sort012(arr);
		System.out.println("Array after seggregation ");
		printArray(arr);
	}

	// Sort the input array, the array is assumed to have values in {0, 1, 2}
	static void sort012(int a[]) {
		int lo = 0, mid = 0, hi = a.length - 1, temp = 0;
		while (mid <= hi) {
			switch (a[mid]) {
			case 0: {
				temp = a[lo];
				a[lo] = a[mid];
				a[mid] = temp;
				lo++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				temp = a[mid];
				a[mid] = a[hi];
				a[hi] = temp;
				hi--;
				break;
			}
			}
		}
	}

	/* Utility function to print array arr[] */
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

}
