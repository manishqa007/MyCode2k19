package Array;

public class Array09_RemovingAElementFromGivenArray {

	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5 };
		int searchAndRemove = 3;
		int len = A.length;
		int B[] = new int[len - 1];
		for (int i = 0; i < len; i++) {
			System.out.println(i);
			if (A[i] == searchAndRemove && i!=len-1) {
				B[i] = A[len - 1];
			} else if(i<len-1){
				B[i] = A[i];
			}
		}
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}
	}
}
