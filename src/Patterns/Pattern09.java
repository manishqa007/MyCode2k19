package Patterns;

//ABCDE
//-ABCD
//--ABC
//---AB
//----A

public class Pattern09 {
	public static void main(String[] args) {
		char ch;
		for (int i = 1; i <= 5; i++) {
			for (int j =1; j<i;j++) {
				System.out.print(" ");
			}
			ch = 'A';
			for (int k = 5; k >= i; k--) {
				System.out.print(ch++);
			}
			System.out.println();
		}
		
	}
}
