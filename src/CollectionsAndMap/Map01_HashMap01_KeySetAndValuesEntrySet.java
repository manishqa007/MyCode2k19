package CollectionsAndMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map01_HashMap01_KeySetAndValuesEntrySet {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(1,"one");
		m.put('a', 'A');
		m.put("four","four");
		m.put(11,"oneone");
		m.put("3","three");
		System.out.println(m);
		Set s = m.keySet();
		System.out.println("Keyset: "+s);

		Collection c = m.values();
		System.out.println("Values: "+c);

		Set es = m.entrySet();
		System.out.println("Entry: "+es);
		
		Iterator itr = es.iterator();
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println(me.getKey()+" "+me.getValue());
			if(me.getKey().equals('a')) {
				me.setValue(2);
			}
		}
		System.out.println(m);
	}
}
