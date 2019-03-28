package Patterns;

//A
//BB
//CCC
//DDDD
//EEEEE

public class Pattern08 {
	public static void main(String[] args) {
		method1();
		System.out.println("-----------------------------");
		method2();
	}

	static void method1() {
		int x = 1;
		for (char ch = 'A'; ch <= 'E'; ch++) {
			for (int i = 1; i <= x; i++) {
				System.out.print(ch);
			}
			System.out.println("");
			x++;
		}
	}

	static void method2() {
		char ch = 'A';
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println("");
			ch++;
		}
	}

}
