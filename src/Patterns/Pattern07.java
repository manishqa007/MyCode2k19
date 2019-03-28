package Patterns;

//        1
//      2 3 2
//    3 4 5 4 3
//  4 5 6 7 6 5 4
//5 6 7 8 9 8 7 6 5

public class Pattern07 {
	public static void main(String[] args) {
		int i, j, k, x;
		for (i = 1; i <= 5; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print("+");
			}
			x = i;
			for (k = 1; k <= (2 * i - 1); k++) {
				if (k < (2*i) / 2) {
					System.out.print(x++);
				} else {
					System.out.print(x--);
				}
			}
			System.out.println("");
		}
	}
}
