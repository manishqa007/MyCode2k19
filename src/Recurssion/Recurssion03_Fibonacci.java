package Recurssion;

//0,1,1,2,3,5,8,13....... pending
public class Recurssion03_Fibonacci {
	public static void main(String args[]) {
		int n = 5;
		System.out.println(fibonacci(n));
	}

	public static int fibonacci(int x) {
		if (x <= 1) {
			return x;
		}
		return  fibonacci(x - 1) + fibonacci(x - 2);
	}
}
