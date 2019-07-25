package Misclleneous;

public class Misc03_DecimalToBinary {
	public static void main(String[] args) {
		int decimal = 25;
		String binary= "";
		while(decimal!=0) {
		binary=  decimal%2+binary;
		decimal=decimal/2;
		}
		System.out.println(binary);
	}
}
