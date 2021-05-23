package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Array13_UnionAndIntersectionOfArray {

	public static void main(String[] args) {
		int arr1[] = { 7, 1, 5, 2, 3, 6 };
		int arr2[] = { 3, 8, 6, 20, 7 };
		unionOfArray_method1(arr1, arr2); // Union will contain only distinct elements from array arr1 and arr2
		System.out.println();
		unionOfArray_method2(arr1, arr2); // o(n) using Set
		System.out.println();
		intersectionOfArray_method1(arr1, arr2); // o(n^2)
		System.out.println();
		intersectionOfArray_method2(arr1, arr2); // o(n)
		
	}

//	Note: Why HashMap ? Bcoz in HashMap key can't be duplicate
	public static void unionOfArray_method1(int[] arr1, int[] arr2) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int loop = (arr1.length > arr2.length) ? arr1.length : arr2.length;
		for (int i = 0; i < loop; i++) {
			if (i < arr1.length)
				hm.put(arr1[i], i);
			if (i < arr2.length)
				hm.put(arr2[i], i);
		}
		System.out.print("The union set of both arrays is :");
		for (Map.Entry entry : hm.entrySet()) {
			System.out.print(entry.getKey() + " ");
		}
	}
	

	public static void unionOfArray_method2(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			set.add(arr2[i]);
		}
		System.out.println("set"+set);
	}

	public static void intersectionOfArray_method1(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		ArrayList<Integer> intersection = new ArrayList<Integer>();
		int i = 0, j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				j++;

			} else if (arr1[i] < arr2[j]) {
				i++;

			} else {
				intersection.add(arr1[i]);
				i++;
				j++;
			}
		}
		System.out.println(intersection);
	}

	public static void intersectionOfArray_method2(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr2[j] + " ");
				}
			}
		}
	}
}
