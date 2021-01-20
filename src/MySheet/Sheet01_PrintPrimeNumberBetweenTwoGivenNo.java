package MySheet;

public class Sheet01_PrintPrimeNumberBetweenTwoGivenNo {

	public static void main(String[] args) {
		int n1 = 5, n2 = 20, count = 0;
		for (int x = n1; x <= n2; x++) {
			for (int i = 2; i <= x / 2; i++) {
				if (x % i == 0) {
					count++;
				}
				if (count > 1) {
					break;
				}
			}
			if (count < 2) {
				System.out.print(x + " ");
			}
			count = 0;
		}

	}

}
