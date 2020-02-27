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
		m.put("one","one");
		m.put("two","two");
		m.put("3","three");
		m.put("four","four");
		m.put(11,"oneone");
		System.out.println(m);
		
		Set s = m.keySet();
		System.out.println("KeySet: "+m);
		
		Collection c =  m.values();
		System.out.println("Values: "+c);
		
		Set s1 = m.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
			if(m1.getKey().equals("3")){
				m1.setValue("THREE");
			}
		}
		System.out.println(m);
	}
}
