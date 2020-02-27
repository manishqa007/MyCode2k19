package CollectionsAndMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map02_LinkedHashMap01_KeySetAndValuesEntrySet {

	public static void main(String[] args) {
		LinkedHashMap m = new LinkedHashMap();
		m.put("one","One");
		m.put("two","Two");
		m.put("3","Three");
		m.put("four","Four");
		m.put("11","OneOne");
		System.out.println("HashMap: "+m);
		
		Set k = m.keySet();
		System.out.println("Key: "+k);
		
		Collection c = m.values();
		System.out.println("Value: "+c);
		
		Set es = m.entrySet();
		System.out.println("Entry Set: "+es);
		
		Iterator itr = es.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.print(m1.getKey()+" "+m1.getValue()+" ");
			if(m1.getValue().equals("OneOne")) {
				m1.setValue("Eleven");
			}
		}
		System.out.println("\nNew HashMap: "+m);
	}
}
