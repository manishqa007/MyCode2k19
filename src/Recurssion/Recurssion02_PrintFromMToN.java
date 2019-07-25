package Recurssion;

public class Recurssion02_PrintFromMToN {
	public static int result;

	public static void main(String[] args) {
		int m,n;
		m=7;
		n=2;
		System.out.println("m: "+" n: "+n);
		PrintFromMToN(m,n);
	}

	private static void PrintFromMToN(int m,int n) {
		if(m>=n) {
			System.out.print(m+" ");
			if(m==n) {
				return;
			}
			PrintFromMToN(m-1, n);
		}
		else if(m<=n) {
			System.out.print(m+" ");
			if(m==n) {
				return;
			}
			PrintFromMToN(m+1, n);
		}
	}

}
