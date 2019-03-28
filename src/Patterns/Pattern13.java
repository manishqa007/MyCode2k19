package Patterns;

//999999999
// 7777777
//  55555
//   333
//    1
public class Pattern13 {
	public static void main(String[] args) {
		int i, j, k, n = 9;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= n; k++) {
				System.out.print(n);
			}
			n = n - 2;
			System.out.println("");
		}
	}
}
