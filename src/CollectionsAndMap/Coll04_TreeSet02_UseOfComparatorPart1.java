package CollectionsAndMap;

import java.util.Comparator;
import java.util.TreeSet;


// Use of Comparator for customized sorting in TreeSet Part 1 
// (Durga Video lecture: "TreeSet Details part 6")
public class Coll04_TreeSet02_UseOfComparatorPart1 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComperator());
		ts.add(2);
		ts.add(3);
		ts.add(10);
		ts.add(0);
		ts.add(15);
		ts.add(6);
		System.out.println(ts);
	}
}

class MyComperator implements Comparator {

	public int compare(Object one, Object two) {
		Integer obj1 = (Integer) one;
		Integer obj2 = (Integer) two;
		if (obj1 > obj2) {
			return 1;
		} else if (obj1 < obj2) {
			return -1;
		} else {
			return 0;
		}
	}

}