package CollectionsAndMap;

import java.util.Enumeration;
import java.util.Vector;

public class Coll03_Vector01_Demo {
	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i = 5; i<10; i++) {
			v.add(i);
		}
		System.out.println(v);
		v.add(0);
		v.add(2);
		v.add(3);
		v.addElement(4);
		v.add(5);
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			Integer I = (Integer)e.nextElement();
			if(I%2==0) {
			System.out.print(I+" ");
			}
		}
		System.out.println();
		System.out.println(v);
	}
}
