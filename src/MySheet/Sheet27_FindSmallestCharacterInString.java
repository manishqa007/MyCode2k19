package MySheet;

// i/p: "All changes saved in drive" o/p: "in"

public class Sheet27_FindSmallestCharacterInString {
	public static void main(String args[]) {
		String str = "All changes saved in drive";
		String[] arr = str.split(" ");
		int minLen = arr[0].length(),index = 0;
		for (int i = 1; i < arr.length; i++) {
			if(minLen>arr[i].length()) {
				minLen = arr[i].length();
				index = i;
			}
		}
		System.out.println(arr[index]+" with min length of: "+minLen);
	}
}