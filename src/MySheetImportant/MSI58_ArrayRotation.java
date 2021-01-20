package MySheetImportant;

//Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
//1) Store the first d elements in a temp array
//   temp[] = [1, 2]
//2) Shift rest of the arr[]
//   arr[] = [3, 4, 5, 6, 7, 6, 7]
//3) Store back the d elements
//   arr[] = [3, 4, 5, 6, 7, 1, 2]

public class MSI58_ArrayRotation {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int d = 2, n =arr.length;
		int temp[]  = new int[d];
		int res[] = new int[n];
		int j = 0; // for iterating temp array
		 for(int i = 0; i<n; i++) {
			 if(i<2) {
				 temp[i] = arr[i]; // temp = {1,2}
				 res[i] = arr[i+d]; // res = {3,4}
			 }else if(i>=2 && i<(n-d)){
				 res[i] = arr[i+d]; // res = {3,4,5,6,7}
			 }else {
				 res[i] = temp[j]; // res = {3,4,5,6,7,1,2}
				 j++;
			 }
		 }
		 for(int i = 0; i<n; i++) {
			 System.out.print(res[i]+" "); // 3 4 5 6 7 1 2 
		 }
	}
}
