package String;

/*
   I/P: "I love India"
   O/P: "I evol aidia"
*/
public class String15_ReverseStringByMaintainingItsSpacePositon {

	public static void main(String[] args) {
		String str = "I love India";
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 32) {
				System.out.print(temp + " ");
				temp = "";
			} else if (str.charAt(i) != 32) {
				temp = str.charAt(i) + temp;
				if (i == str.length() - 1) {
					System.out.print(temp);
				}
			}
		}
		System.out.println();
		// method 2
		String strArr[] = str.split(" ");
		String temp2 = "", rev;

		for (int i = 0; i < strArr.length; i++) {
			temp2 = strArr[i]; rev = "";
			for (int j = temp2.length()-1; j >=0;j--) {
				rev = rev + temp2.charAt(j);
			}
			System.out.print(rev+" ");
		}

	}
}
