package CollectionsAndMap;

import java.util.LinkedList;
import java.util.ListIterator;

public class Coll06_ListIterator {

	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("Z");
		System.out.println(al);
		 
		ListIterator itr = al.listIterator();
		while (itr.hasNext()) {
			String str  = itr.next().toString();
			System.out.println("Str: "+str);
			if (str.equals("B")) {
				itr.remove();
				System.out.println("1: "+str);
			}
			if (str.equals("C")) {
				itr.add("E");
			} else {
				System.out.println("2: "+str);
			}
			System.out.println("-------------------------");
		}
		System.out.println(al);
	}
}
