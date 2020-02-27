package String;

public class String18_Reverse_ReverseStringUsingSwapping {

	public static void main(String[] args) {
		String str = "Reverse this string";
		char[] ch = str.toCharArray();
		int left, right;
		char temp;
		for(left = 0, right = ch.length-1; left<right; left++, right--) {
			temp = ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
		}
		
		for(char c: ch) {
			System.out.print(c);
		}
	}
}
