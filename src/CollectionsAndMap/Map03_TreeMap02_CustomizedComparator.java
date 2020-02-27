package CollectionsAndMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Map03_TreeMap02_CustomizedComparator {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap(new MyCompare());
		tm.put("zzz", 10);
		tm.put("aaa", 20);
		tm.put("ccc", 30);
		tm.put("bbb", 40);
		tm.put("hhh", 50);
		tm.put("ddd", 60);
		System.out.println(tm);
	}
}

class MyCompare implements Comparator{

	public int compare(Object obj1, Object obj2) {
		String s1 = (String)obj1;
		String s2 = (String)obj2;
//		return s1.compareTo(s2); // Ascending
		return -s1.compareTo(s2); // Descending
	}
}
