package MySheetImportant;


// count square in chess
public class MSI08_CountSquareInNIntoN {

	public static void main(String[] args) {
		int n = 8;
		double countSq = 0;
		for (int i = 1; i<=n;i++)
			countSq = countSq + Math.pow(i, 2);
		System.out.println("Square count in N x N is: "+countSq);
	}
}