package Adobe;
/*
	1
	11
	121
	1331
	14641
*/
public class Pattern01_PascalTriangle {
	// Diver code
	public static void main(String[] args) {
		int n = 7;
		printPascal(n);
	}

	// Pascal function
	public static void printPascal(int n) {
		for (int i = 1; i <= n; i++) {
			int C = 1;
			for (int j = 1; j <= i; j++) {
				// The first value in a line is always 1
				System.out.print(C + " ");
				C = C * (i - j) / j;    // This is the logic
			}
			System.out.println();
		}
	}
}
