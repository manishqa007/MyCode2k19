package Collections;

import java.util.LinkedList;

public class Coll02_LinkList01_Demo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(null);
		System.out.println(list);
		list.add(2);
		list.add(null);
		list.add("String val");
		list.add(5);
		System.out.println(list);
		list.add(2, "Position 2nd");
		list.set(3, "Position 3rd");
		list.addFirst(null);
		list.add("last");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
	}

}
