package Recurssion;

public class Recurssion01_Factorial {

	public static void main(String[] args) {
		int n = 4;
		System.out.println("Factorial of "+ n +" is: " +factorial(n));
	}

	private static int factorial(int n) {
		int result;
		if (n == 0)
			return 1;
		else {
			result = n * factorial(n - 1);
			return result;
		}
	}

}
