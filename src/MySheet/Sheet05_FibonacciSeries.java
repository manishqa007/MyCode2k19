package MySheet;

public class Sheet05_FibonacciSeries {

	public static void main(String args[]) { // 1 , 1, 2,3,5,8
		int num = 10;
		fib1(num); // Arithmetic operation
		System.out.println();
		System.out.println(fib2(num)); // Recurssion
	}

	public static void fib1(int num) {
		int s1 = 0, s2 = 1, sum = 0, itr=1;
		System.out.print("1 ");
		do {
			sum = s1 + s2;
			System.out.print(sum + " ");
			s1 = s2;
			s2 = sum;
			itr++;
		} while (itr <= num);

	}

	private static int fib2(int num) {
		if(num<=1) {
			return 1;
		}
		return(fib2(num-1)+fib2(num-2));
	}

}
