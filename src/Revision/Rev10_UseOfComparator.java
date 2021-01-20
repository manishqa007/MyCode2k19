package Revision;

import java.util.Comparator;
import java.util.TreeSet;

public class Rev10_UseOfComparator {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(5);
		ts.add(10);
		ts.add(0);
		ts.add(15);
		ts.add(16);
		ts.add(5);
		System.out.println(ts);
	}
}

class MyComparator implements Comparator{
	
	public int compare(Object obj1, Object obj2) {
		Integer num1 = (Integer)obj1;
		Integer num2 = (Integer)obj2;
		if(num1<num2)
			return -1;
		else if(num1>num2)
			return 1;
		else
			return 0;
	}
}
