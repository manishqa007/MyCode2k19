package MySheet;

public class Sheet30_AddTwoNoWithoutPlusOperator {

	public static void main(String[] args) {
//		method1();
		method2();
	}

	private static void method2() {
		int a = 10, b = 6;
		System.out.println(a & b);
	}

	private static void method1() {
		int a = 10, b = 5;
		if (b > 0) {
			while (b > 0) {
				a++;
				b--;
			}
		}
		if (b < 0) { // when 'b' is negative
			while (b < 0) {
				a--;
				b++;
			}
		}
		System.out.println("Sum is: " + a);
	}
}
