package Patterns;

//1 
//1 1 
//1 2 1 
//1 3 3 1 
//1 4 6 4 1 

public class Pattern17 {
	// Diver code
	public static void main(String[] args) {
		int n = 10;
		printPascal(n);
		System.out.println("---------------------------------------------------");
		printPascalMyMethod(n); // issue in this method
	}

	private static void printPascalMyMethod(int n) {
		int A[] = new int[n];
		for(int i= 1; i<=n;i++) {
			int c = 1;
			for(int j=1;j<=i;j++) {
				if(i<=2) {
					System.out.print(c+" ");
				}else if(j==i) {
					System.out.print("1 ");
				}else {
					System.out.print(c+" ");
					c =A[j-1]+A[j];
				}
				A[i] = c;
			}
			System.out.println();
		}
		
	}

	// Pascal function
	public static void printPascal(int n) {
		for (int line = 1; line <= n; line++) {
			int C = 1;							// Used to represent C(line, i)
			for (int i = 1; i <= line; i++) {
												// The first value in a line is always 1
				System.out.print(C + " ");
				C = C * (line - i) / i;
			}
			System.out.println();
		}
	}
}
