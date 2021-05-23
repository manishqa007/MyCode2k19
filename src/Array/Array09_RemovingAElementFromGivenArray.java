package Array;

public class Array09_RemovingAElementFromGivenArray {

	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5, 6};
		int searchAndRemove = 3;
		int len = A.length;
		method1(A,searchAndRemove,len);
		System.out.println();
		method2(A,searchAndRemove,len); // without changing the order
		System.out.println();
		method3(A,searchAndRemove,len); // remove in same Array without changing the order 
	}

	private static void method1(int[] A, int searchAndRemove, int len) {
		int B[] = new int[len - 1];
		for (int i = 0; i < len; i++) {
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

	private static void method2(int[] arr, int searchAndRemove, int len) {
		int temp[] = new int[len - 1];
		int j = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i] != searchAndRemove) {
				temp[j] = arr[i];
				j++;
			}
		}
		
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
	}
	
	private static void method3(int[] arr, int searchAndRemove, int len) {
		int temp = 0; //{ 1, 2, 3, 4, 5, 6 }
		boolean flag = false;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==searchAndRemove || flag == true) {
				arr[i]=arr[i+1];
				flag = true;
			}	
		}
	}
}
