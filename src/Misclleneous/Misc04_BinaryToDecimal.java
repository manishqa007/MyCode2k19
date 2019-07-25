package Misclleneous;

public class Misc04_BinaryToDecimal {
	public static void main(String[] args) {
		int binary = 11001;
		double decimal = 0;
		int lastDigit;
		int length = String.valueOf(binary).length();
		for(int i = 0; i<length;i++) {
			lastDigit = binary%10;
			decimal = decimal+ (lastDigit* Math.pow(2, i));
			binary = binary/10;
		}
		System.out.println("decimal value is: "+decimal);
	}
}
