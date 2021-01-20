package CollectionsAndMap;

import java.util.ArrayList;
import java.util.Iterator;
// 1st string 1st alphabet, 2nd string 2nd alphabet and so on  form a word
public class Coll02_ArrayList02_FromNewCharacter {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Manish");
		al.add("Ankita");
		al.add("Bijendra");
		al.add("Pradeep");
		String expectedWord = "", temp="";
		int i=0;
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			temp = itr.next().toString();
			expectedWord = expectedWord + temp.charAt(i++);
		}
		System.out.println("expectedWord: "+expectedWord);
	}
}
