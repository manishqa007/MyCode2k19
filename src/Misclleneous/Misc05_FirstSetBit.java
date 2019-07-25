package Misclleneous;

//	Input:
//	2
//	18
//	12
//	
//	Output:
//	2
//	3
//	
//	Explanation:
//	Testcase 1: Binary representation of the 18 is 010010, the first set bit from the right side is at position 2.

public class Misc05_FirstSetBit {

	public static void main(String[] args) {
		int n = 7;
		String binary = "";
		int count = (int) (logValueWithBaseTwo(n,2) + 1);
		System.out.println("Number of binary digit: "+count);
		int position = 0;
		while (n > 0) {
			binary = String.valueOf(n % 2) + binary;
			count++;
			if(n%2 ==1) {
				position = count;
				System.out.println("coun t: "+count);
			}else {
			}
			n=n/2;
		}
		System.out.println(binary);
		System.out.println(position+" "+binary.length());
	}

	private static double logValueWithBaseTwo(int n, int base) {
		double res = (Math.log(n)/Math.log(base));
		System.out.println(res);
		return res;
	}
}
