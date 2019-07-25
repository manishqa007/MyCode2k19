package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Coll04_TreeSet05_SortInAscAccordingToIncreasingLengthComperatorPart4 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyCompar());
		ts.add("AA");
		ts.add("A");
		ts.add("AAA");
		ts.add(new StringBuffer("BBB").toString());
		ts.add(new StringBuffer("CC").toString());
		ts.add("B");
		ts.add("ZZZZ");
		System.out.println(ts);
	}
}

class MyCompar implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String str1 = obj1.toString();
		String str2 = obj2.toString();
		int l1 = str1.length();
		int l2 = str2.length();
		if (l1 < l2) {
			return -1;
		} else if (l1 > l2) {
			return 1;
		} else { // same length
			return (str1).compareTo(str2);
		}
	}
}
