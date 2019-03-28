package Patterns;

//    A
//   ABC
//  ABCDE
// ABCDEFG
//ABCDEFGHI
public class Pattern11 {
	public static void main(String[] args) {
		int k = 1, n = 1;
		char ch = 'A';
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			while (k <= n) {
				System.out.print(ch);
				ch++;
				k++;
			}
			ch = 'A';
			n = n + 2;
			k = 1;
			System.out.println("");
		}
	}
}
