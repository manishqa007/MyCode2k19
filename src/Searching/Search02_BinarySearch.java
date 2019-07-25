package Searching;

/**
 * @author manishpatel
 *
 */
public class Search02_BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9, 13, 16, 18, 24, 30 };
		int first, last, middle, n, i, search, flag;
		n = arr.length;
		flag = 0;
		i = 0;
		search = 244;
		first = i;
		last = n - 1;
		middle = (first + last) / 2;
		System.out.println("middle: " + middle);
		while (i < n) {
			if (search == arr[middle]) {
				System.out.println("Element " + search + " found at position: " + (middle + 1));
				flag = 1;
				break;
			} else if (search > arr[middle]) {
				first = middle + 1;
				middle = (first + last) / 2;

			} else {
				last = middle - 1;
				middle = (first + last) / 2;
			}
			i++;
		}
		if (flag == 0) {
			System.out.println("Element not found....");
		}

	}

}
