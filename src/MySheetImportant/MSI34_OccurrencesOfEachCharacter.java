package MySheetImportant;

import java.util.HashMap;
import java.util.Map;

public class MSI34_OccurrencesOfEachCharacter {

	public static void main(String[] args) {
		String str = "geeksforgeek";
		method1(str);
		method2(str); // using hashmap
	}

	private static void method2(String str) {
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		for(char ch: str.toCharArray()) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
	}

	private static void method1(String str) {
		char ch[] = str.toCharArray();
		int count;
		for (int i = 0; i < ch.length; i++) {
			count=1;
			if (ch[i] != '$') {
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						count++;
						ch[j] = '$';
					}
				}
				System.out.println(ch[i]+" : "+count);
			}
		}
	}
}
