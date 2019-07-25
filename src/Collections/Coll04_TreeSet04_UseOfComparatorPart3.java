package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Coll04_TreeSet04_UseOfComparatorPart3 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparators());
		ts.add("Ten");
		ts.add("Zero");
		ts.add("Six");
		ts.add("Zero");
		ts.add("Mango");
		System.out.println(ts); // [Mango, Six, Ten, Zero]

	}
}

class MyComparators implements Comparator {
	public int compare(Object one, Object two) {
		String str1 = one.toString();
		String str2 = (String) two;
//		return str1.compareTo(str2);  //For ascending order
		return -str1.compareTo(str2); // For descending order  [Zero, Ten, Six, Mango]
	}
}