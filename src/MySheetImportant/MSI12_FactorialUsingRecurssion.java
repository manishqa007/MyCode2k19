package MySheetImportant;

public class MSI12_FactorialUsingRecurssion {

	public static void main(String[] args) {
		int num = 6;
		double f = fact(num);
		System.out.println("Factorial of num is: " + f);

	}

	public static double fact(int num) {
		if (num == 1)
			return 1;
		return num * fact(num - 1);
	}

}
