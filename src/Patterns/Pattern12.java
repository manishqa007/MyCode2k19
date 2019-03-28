package Patterns;

//    0
//   101
//  21012
// 3210123
//432101234

public class Pattern12 {

	public static void main(String[] args) {
		int i, j, dec, inc = 1, c = 1, n = 1;
		for (i = 1; i <= 5; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			dec = i - 1;
			while (c <= n) {
				if (dec < 0) {
					System.out.print(inc);
					inc++;
				} else {
					System.out.print(dec);
					dec--;
				}
				c++;
			}
			c = 1;
			inc = 1;
			n = n + 2;
			System.out.println("");
		}
	}

}
