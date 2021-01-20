package CollectionsAndMap;

import java.util.TreeSet;

public class Coll04_TreeSet01_Demo {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add(new String("Manish"));
		System.out.println(ts);
		ts.add(new String("Bij"));
		ts.add(new String("Ankita"));
		ts.add(new String("32"));
		ts.add(new String("Pradeep"));
		ts.add(new String("1"));
		ts.add(new String("Ayushi"));
		System.out.println(ts); // [1, 32, Ankita, Ayushi, Bij, Manish, Pradeep]
	}
}
