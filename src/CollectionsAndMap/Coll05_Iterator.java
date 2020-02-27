package CollectionsAndMap;

import java.util.ArrayList;
import java.util.Iterator;

public class Coll05_Iterator {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		for(int i = 0; i<10;i++) {
		al.add(i);
		}
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
}
