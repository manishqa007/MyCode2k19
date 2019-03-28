//***********************************Important Concept***************************************
package Patterns;

public class Pattern15 {
	public static void main(String[] args) {
		p1();
		System.out.println("---------------");
		p2();
		System.out.println("---------------");
		p3();
	}

	// 3
	// 32
	// 321
	// 3210
	// 321
	// 32
	// 3
	static void p1() {
		for (int i = 3; i >= -3; i--) {
			for (int j = 3; j >= Math.abs(i); j--) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	// 3
	// 23
	// 123
	// 0123
	// 123
	// 23
	// 3
	static void p2() {
		for (int i = 3; i >= -3; i--) {
			for (int j = Math.abs(i); j <= 3; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	// D
	// DC
	// DCB
	// DCBA
	// DCB
	// DC
	// D
	static void p3() {
		for (int i = 3; i >= -3; i--) {
			for (int j = 3; j >= Math.abs(i); j--) {
				System.out.print((char) (j + 65));
			}
			System.out.println("");
		}
	}
}
