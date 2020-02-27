package Revision;

//	      1
//		2 3 2
//	  3 4 5 4 3
//	4 5 6 7 6 5 4
//5 6 7 8 9 8 7 6 5


public class Rev03_Pattern07 {

	public static void main(String[] args) {
		int x = 1;
		for(int i =1; i<=5;i++) {
			for(int j = 4; j>=i; j--) {
				System.out.print("*");
			}
			x=i;
			for(int k = 1;k<=(i*2 - 1);k++) {
				if(k<(i*2)/2) {
					System.out.print(x++);
				}else {
					System.out.print(x--);
				}
			}
			System.out.println();
		}
	}

}
