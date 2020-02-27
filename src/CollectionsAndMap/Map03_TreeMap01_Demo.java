package CollectionsAndMap;

import java.util.TreeMap;

public class Map03_TreeMap01_Demo {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("zzz", "Zero");
		tm.put("aaa", "One");
		tm.put("ccc", "Three");
		tm.put("bbb", "two");
		tm.put("hhh", "Four");
		tm.put("ddd", "Five");
		System.out.println(tm);
	}

}
