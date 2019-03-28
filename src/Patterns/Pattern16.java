package Patterns;

//1  2  3
//6  5  4
//7  8  9
//12 11 10

public class Pattern16 {
	public static void main(String[] args) {
		int n = 1;
		boolean flag = false;
		for (int i = 1; i <= 4; i++) {
			if (flag) {
				if (i % 2 == 0) {
					n = n + 2;
				} else {
					n = n + 4;
				}
			}
			for (int j = 1; j <= 3; j++) {
				System.out.print(n);
				if (i % 2 == 0) {
					n--;
				} else {
					n++;
				}
			}
			System.out.println("");
			flag = true;
		}
	}
}
