package Matrix;

import java.util.Scanner;

public class Matrix01_Multiplication {

	public static void main(String[] args) {
		int A[][] = new int[3][3];
		int B[][] = new int[3][3];
		int C[][] = new int[3][3];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Enter the value in matrix A");
				A[i][j] = input.nextInt();
				System.out.println("Enter the value in matrix B");
				B[i][j] = input.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) { // Printing of matrix A
			for (int j = 0; j < 3; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------");

		for (int i = 0; i < 3; i++) { // Printing of matrix B
			for (int j = 0; j < 3; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				C[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					C[i][j] = A[i][k] * B[k][j] + C[i][j];
				}
			}
		}

		System.out.println("-------------------------------------------------------");

		for (int i = 0; i < 3; i++) { // Printing of matrix C
			for (int j = 0; j < 3; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}

	}
}
