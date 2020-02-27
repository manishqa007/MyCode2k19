package String;

//Input: "I am Manish"
//Output: "hsinaM ma I"

public class String16_Reverse_ReverseAStringWithoutInbuiltFunction {
	public static void main(String[] args) {
		String str = "I am Manish", reverse = "";
		System.out.println("Given string: " + str);
		for (int i = 0; i < str.length(); i++) {
			reverse = str.charAt(i) + reverse;
		}
		System.out.println("Reversed string: " + reverse);
	}
}
