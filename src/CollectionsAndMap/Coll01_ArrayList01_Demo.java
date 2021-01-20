package CollectionsAndMap;

import java.util.ArrayList;

public class Coll01_ArrayList01_Demo {
	public static void main(String[] args) {
		ArrayList al  = new ArrayList();
		al.add(12);
		al.add('t');
		al.add(4);
		System.out.println(al);
		al.add(null);
		al.add(2,"Manish at index 2");
		System.out.println(al);
	}
}
