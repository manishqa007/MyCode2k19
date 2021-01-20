package Adobe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
	Input: geeks for geeks, Output: geeks
	Input: hello world,     Output: world    ["hello" and "world" both have 1 frequency. We print world as it comes last in the input array]
	Input: world wide fund, Output: fund
*/

//NOTE: If multiple words have same frequency, then print the word whose first occurence occurs last in the array as compared to the other strings with same frequency.
public class String09_MostFrequentWordInAnArrayOfStrings {

	public static void main(String[] args) {
		String str = "geeks for geeks";
		method1(str);
		method2(str); // using HashMap
	}

	private static void method1(String str) {
		String arrStr[] = str.split(" ");
		String maxOccuranceStr = "";
		int count = 0, max = count;
		for (int i = 0; i < arrStr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arrStr.length; j++) {
				if (arrStr[i].equals(arrStr[j])) {
					count++;
				}
			}
			if (count >= max) {
				max = count;
				maxOccuranceStr = arrStr[i];
			}
		}
		System.out.println(maxOccuranceStr + " : " + max);
	}

	private static void method2(String str) {
		String arrStr[] = str.split(" ");
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < arrStr.length; i++) {
			if (hm.containsKey(arrStr[i])) {
				hm.put(arrStr[i], hm.get(arrStr[i]) + 1);
			} else
				hm.put(arrStr[i], 1);
		}
		System.out.println(hm);
		
		int maxCount = 0;
		String word = "";
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				word = entry.getKey();
			}
		}
		System.out.println(word+" "+maxCount);
	}
}
