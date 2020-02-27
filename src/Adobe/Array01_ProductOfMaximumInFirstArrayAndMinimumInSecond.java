package Adobe;

public class Array01_ProductOfMaximumInFirstArrayAndMinimumInSecond {

	public static void main(String[] args) {
		int A[]= {3,1,2,6,1,0,9};
		int B[]= {1,2,6,-1,0,9};
		int max = A[0];
			for(int i = 1; i<A.length;i++) {
				if(A[i]>max)
					max=A[i];
			}
			System.out.println("Max form array A[]: "+max);
		int min = B[0];
			for(int i = 1; i<B.length;i++) {
				if(B[i]<min)
					min = B[i];
			}
			System.out.println("Min form array B[]: "+min);
			
			System.out.println("Product of Min and Max: "+(max * min));
	}
}
