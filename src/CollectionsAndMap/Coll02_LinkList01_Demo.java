package CollectionsAndMap;

import java.util.LinkedList;

public class Coll02_LinkList01_Demo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(3);
		list.add("two");
		list.add(null);
		System.out.println(list);
		list.addFirst("add first");
		list.addLast("add last");
		list.add("bogus");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
	}

}
