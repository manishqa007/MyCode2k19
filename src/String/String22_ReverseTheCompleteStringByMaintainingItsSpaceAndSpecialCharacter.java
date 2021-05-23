package String;

public class String22_ReverseTheCompleteStringByMaintainingItsSpaceAndSpecialCharacter {
	// I/p: I lov@e In$dia
	// O/p: a idn@I ev$olI

	public static void main(String[] args) {
		String str = "I love Indi@a";
		String rev = "";
		int index = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(index) == 32 || str.charAt(index)=='@') {
				System.out.print(str.charAt(index));
			} else if (str.charAt(i) != 32 || str.charAt(index)!='@')
				System.out.print(str.charAt(i));
			
			index++;
		}
	}
}
