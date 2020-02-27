package CollectionsAndMap;

import java.util.Comparator;
import java.util.TreeSet;

// Use of Comparator for customized sorting in TreeSet Part 1 
// (Durga Video lecture: "TreeSet Details part 6")

public class Coll04_TreeSet03_UseOfComparatorPart2 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator());
			ts.add(10);
			ts.add(0);
			ts.add(15);
			ts.add(16);
			ts.add(5);
			System.out.println(ts);
	}
}

class MyComparator implements Comparator{
	public int compare(Object one, Object two) {
		Integer obj1 = (Integer)one;
		Integer obj2 = (Integer)two;
//		return obj1.compareTo(obj2);  //For ascending order
		return - (obj1.compareTo(obj2)); //For descending order
	}
}