package MySheetImportant;

public class MSI15_FibonacciUsingRecurssion {

	public static void main(String[] args) {
		int num = 10;
		double f = fib(num);
		System.out.println("Fibonacci is: " + f);
	}

	public static double fib(int n) {
		if (n <= 0)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}
}
