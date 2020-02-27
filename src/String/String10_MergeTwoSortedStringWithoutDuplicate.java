package String;

public class String10_MergeTwoSortedStringWithoutDuplicate {

	public static void main(String[] args) {
		String str1 = "abcdef";
		String str2 = "beghij";
		merge(str1,str2);
	}

	private static void merge(String str1, String str2) {
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
