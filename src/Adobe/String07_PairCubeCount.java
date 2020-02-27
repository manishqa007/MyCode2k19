package Adobe;

import java.util.Scanner;

/*
 	Given N, count all ‘a’(>=1) and ‘b’(>=0) that satisfy the condition a3 + b3 = N.
	Input : N = 9
	Output : 2
	1^3 + 2^3 = 9
	2^3 + 1^3 = 9
*/ 
public class String07_PairCubeCount {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int N = input.nextInt();
	cubePairNN(N);
	System.out.println("-------------------------------------------");
	cubePairN(N);
	}

	private static void cubePairN(int n) {
		int count=0;
		for(int i=0; i<=n;i++) {
			for(int j = 0;j<n;j++) {
				if((i*i*i)+(j*j*j)==n) {
					System.out.println("("+i+","+j+")");
					count++;
				}
			}
		}	
		System.out.println("Cube pair count via NN: "+count);
	}

	private static void cubePairNN(int n) {
		int a=0,diff,cubeRootOfDiff,count=0 ;
		for(int i = 1;i<=n;i++) {
			a=i;
			diff = n-(a*a*a);
			cubeRootOfDiff = (int)(Math.cbrt(diff));
			if(Math.pow(cubeRootOfDiff,3)+Math.pow(a,3)==n)
				count++;
		}
		System.out.println("Cube pair count via N: "+count);
	}

}
