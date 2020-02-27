package Adobe;

/*
	Input N=4 
	Output : 
	4444444 
	4333334 
	4322234 
	4321234 
	4322234 
	4333334 
	4444444
	
	Input N=3 
	Output : 
	 33333 
	 32223 
	 32123 
	 32223 
	 33333
*/ 
public class Pattern02_IntrestingPatterns {

	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<2*n-1;i++) {
			for(int j=0;j<2*n-1  ;j++) {
				System.out.print(1+Math.max(Math.abs(n-i-1),Math.abs(n-j-1)));
			}
			System.out.println();
		}
	}

}
