package String;

/*
  I/P: ab2c2 
  O/P: ababc2 => ababcababc
*/
public class String12_StringPrecedingTheIntegersRepeated {

	public static void main(String[] args) {
		String str = "a4b2c1";
		String temp = "";
		String print = "";
		boolean flag = false;
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 48 && str.charAt(i) <= 57) {
				count = Character.getNumericValue(str.charAt(i));
				flag = true;
				print = temp;
			} else {
				temp = temp + str.charAt(i);
			}
			for (int j = 1; j <= count; j++) {
				if (flag == false) {
					break;
				}
				System.out.print(print);
				if (j < count) {
					temp = temp + print;
				}
			}
			System.out.println();
			flag = false;
			count = 0;
		}
	}
}
