package String;

public class String21_ReverseTheCompleteStringByMaintainingItsSpace {
	// I/p: I love India
	// O/p: a idnI evolI
	public static void main(String[] args) {
		String str = "I love India qwert";
		int index = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(index) == 32) {
				System.out.print(" " + str.charAt(i));
			} else if (str.charAt(i) != 32)
				System.out.print(str.charAt(i));

			index++;
		}

	}
}
