package String;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class String10_MergeTwoSortedStringWithoutDuplicate {

	public static void main(String[] args) {
		String str1 = "abcdef";
		String str2 = "beghij";
		merge1(str1,str2);
		merge2(str1,str2); //my way
		System.out.println();
		merge3(str1,str2); //Using sorted set i.e, TreeSet
	}

	private static void merge3(String str1, String str2) {
		Set<Character> st = new TreeSet<Character>();
		int loop = str1.length()>str2.length()?str1.length():str2.length();
		for (int i = 0; i < loop; i++) {
			if(i<str1.length())
				st.add(str1.charAt(i));
			if(i<str2.length())
				st.add(str2.charAt(i));
		}
//		System.out.println(st);
		Iterator itr = st.iterator();
		String res="";
		while(itr.hasNext()) {
			res = res + (char)itr.next();
		}
		System.out.println(res);
	}

	private static void merge2(String str1, String str2) {
		char ch[]=new char[256];
		int loop = str1.length()>str2.length()?str1.length():str2.length();
		for (int i = 0; i < loop; i++) {
			if(ch[i]<=0) {
				ch[str1.charAt(i)]++;
				ch[str2.charAt(i)]++;
			}
		}
		for (int i = 95; i <= 122; i++) {
			if(ch[i]>0)
				System.out.print((char)i+" ");
		}
		
		
	}

	private static void merge1(String str1, String str2) {
		String result = "";
		for (int i = 0; i < str2.length(); i++) {
			if(str1.charAt(i)==str2.charAt(i)) {
				result = result +str1.charAt(i);
			}else {
				result = result +str1.charAt(i) + str2.charAt(i);
			}
		}
		System.out.println("merger String : "+result);
		// Now remove duplicates
	}
}
