package CollectionsAndMap;
/*
I/P:
	list1 = 2=>3=>4
	list1 = 6=>5=>1
O/P: 
	Soln = 8=> 8=> 5
*/

import java.util.LinkedList;
import java.util.Scanner;

public class Coll04_LinkedListAddition {

	public static void main(String[] args) {
		int length1, length2, sumLoop;
		double value;
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList solnList = new LinkedList();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of List 1: ");
		length1 = input.nextInt();
		System.out.println("Enter the length of List 2: ");
		length2 = input.nextInt();

		System.out.println("Enter Value in List 1");
		for (int i = 0; i < length1; i++) {
			value = input.nextInt();
			list1.add(value);
		}

		System.out.println("Enter Value in List 2");
		for (int i = 0; i < length2; i++) {
			value = input.nextInt();
			list2.add(value);
		}
		System.out.println(list1);
		System.out.println(list2);
		if (length1 > length2) {
			sumLoop = length1;
		} else {
			sumLoop = length2;
		}
	}

}
