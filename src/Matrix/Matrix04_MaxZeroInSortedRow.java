package Matrix;

public class Matrix04_MaxZeroInSortedRow {

	public static void main(String[] args) {
		int arr[][] = {{0,0,1,1},
					   {0,0,0,1},
					   {1,1,1,1}};
		int max0 = 0,temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <arr[i].length; j++) {
				if(arr[i][j]==0)
					temp++;
				else 
					break;
			}
			if(temp>max0) {
				max0 = temp;
				temp = 0;
			}
			
		}
		System.out.println(max0);
	}

}
