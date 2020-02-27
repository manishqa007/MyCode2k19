package Revision;

public class Rev09_Recurssion01_fibonacci {

	public static void main(String[] args) {
		int n = 5, i = 0, c;
		for (c = 1; c <= n; c++) {
			System.out.print(" " + Fibonacci(i));
			i++;
		}
	}

	public static int Fibonacci(int n) {
		if (n <= 1)
			return n;
		else
			return (Fibonacci(n - 1) + Fibonacci(n - 2));
	}
}