package String;

public class String13_PrintSubstrinFromGivenString {

	public static void main(String[] args) {
		String str = "ABCD";
		SubString_method1(str);
		System.out.println("=============================");
		SubString_method2(str);
	}

	public static void SubString_method1(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				temp = temp + str.charAt(j);
				System.out.println(temp);
			}
			temp = "";
		}
	}

	public static void SubString_method2(String str) {
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++)
				System.out.println(str.substring(i, j));
		}
	}

}
