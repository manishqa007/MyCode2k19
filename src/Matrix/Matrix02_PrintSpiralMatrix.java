package Matrix;
//	oo o1 o2 o3 o4
//	11 12 13 14 15
//	21 22 23 24 25
//	31 32 33 34 35
public class Matrix02_PrintSpiralMatrix {
	public static void main(String[] args) {
		int arr[][] = { { 1,  2,  3,   4, 7}, 
						{ 8,  7,  6,   5, 1},
						{ 31, 41, 51, 61, 9},
						{ 21, 9, 10,  40, 8}, 
						{ 31, 41, 51, 61, 9} 
					  };
		int i,j;
		int row_index_start, row_index_end, col_index_start, col_index_end;
		row_index_start = 0;	row_index_end = 4;
		col_index_start = 0;	col_index_end = 4;
		
		for (i = 0; i <= row_index_end; i++) { // Printing of matrix
			for (j = 0; j <= col_index_end; j++) { 
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		while((row_index_start<row_index_end) && (col_index_start <col_index_end)) {
		for (j =col_index_start ; j <= col_index_end; j++) { // Printing 1st row
			System.out.print(arr[row_index_start][j] + " ");
		}
		row_index_start ++; //row_index_start = 1
		
		for (j = row_index_start; j <= row_index_end; j++) { // Printing last column
			System.out.print(arr[j][col_index_end] + " ");
		}
		col_index_end--;  //col_index_end = 3
		
		for(j= col_index_end ;j>=col_index_start; j--) { // Printing last row
			System.out.print(arr[row_index_end][j]+" ");
		}
		row_index_end--; // row_index_end = 3
		
		for(j= row_index_end; j>=row_index_start; j--) {  // Printing last column
			System.out.print(arr[j][col_index_start]+" ");
		}
		col_index_start++;
		}
	}
}
