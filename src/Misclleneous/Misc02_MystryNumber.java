package Misclleneous;
public class Misc02_MystryNumber {
	public static String reverse(String temp) {
		String rev = "";
		for (int i = 0; i < temp.length(); i++) {
			rev = temp.charAt(i) + rev;
		}
		return rev;
	}
	public static void main(String[] args) {
		int num = 22;
		boolean flag = false;
		String actual_n1 = "";
		String reverse_n1 = "";
		for (int i = (num)/2; i > 9; i--) {
			actual_n1 = String.valueOf(i);
			reverse_n1 = reverse(actual_n1);
			if (num ==Integer.parseInt(actual_n1)+Integer.parseInt(reverse_n1)) {
				System.out.println(num+ " is mystry number i.e,: "+actual_n1+", "+reverse_n1);
				flag = true;
			}
		}
		if(flag==false) {
			System.out.println("No mystry number exist");
			System.out.println();
		}
	}
}
