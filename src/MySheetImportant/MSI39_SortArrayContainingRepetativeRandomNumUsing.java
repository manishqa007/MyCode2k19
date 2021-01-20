package MySheetImportant;

//Dutch National Flag Algorithm OR 3-way Partitioning
public class MSI39_SortArrayContainingRepetativeRandomNumUsing {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		sort012(arr);
		System.out.println("Array after seggregation ");
		System.out.println("Array after seggregation ");
		printArray(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
	}

	/* Utility function to print array arr[] */
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

	private static void sort012(int arr[]) {
		int lo = 0, mid = 0, hi = arr.length - 1, temp = 0;

		while (mid <= hi) {
			switch (arr[mid]) {
			case 0: {
				temp = arr[mid];
				arr[mid] = arr[lo];
				arr[lo] = temp;
				mid++;
				lo++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				temp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi]=temp;
				hi--;
			}
			}
		}
	}
}
