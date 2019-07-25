package Collections;

import java.util.ArrayList;

public class Coll01_ArrayList01_Demo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(null);
		al.add(2);
		System.out.println(al);
		al.add(null);
		System.out.println(al);
		al.add("Manish");
		al.add("SBS");
		al.add(0);
		al.add(2,"Index 2 Position 3rd");
		al.add(null);
		System.out.println(al);
	}
}
