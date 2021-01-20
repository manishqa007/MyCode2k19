package MySheetImportant;

public class MSI30_AddOrSubtractTwoNumberWithoutUsingOperator {

	public static void main(String[] args) {
		int a = 2, b = 4;
		
		add_method1(a, b);
		add_method2(a, b);
		
		subtract_method(a,b);
	}

	private static void subtract_method(int smaller, int greater) {
		while(smaller>0) {
			greater--;
			smaller--;
		}
		System.out.println("After subtraction: "+greater);
		
	}

	private static int add_method1(int a, int b) {
		while (a > 0) {// to handle positive a
			b++;
			a--;
		}
//		while (a < 0) {// to handle negative a
//			b--;
//			a++;
//		}
		System.out.println("After addition: "+b);
		return b;
	}

	static int add_method2(int x, int y) {
		while (y != 0) { // Iterate till there is no carry
			int carry = x & y; // carry now contains common set bits of x and y
			x = x ^ y; // Sum of bits of x and y where at least one of the bits is not set
			y = carry << 1; // Carry is shifted by one so that adding it to x gives the required sum
		}
		System.out.println(x);
		return x;
	}
}
