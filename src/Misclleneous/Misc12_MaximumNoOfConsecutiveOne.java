package Misclleneous;

public class Misc12_MaximumNoOfConsecutiveOne {

	public static void main(String[] args) {
		int binary = 1011010111;
		String temp = String.valueOf(binary);
		maxConsecutiveOne(temp);
	}

	public static void maxConsecutiveOne(String bin) {
		int maxCount = 0, count = 0;
		for (int i = 0; i < bin.length(); i++) {
			if (bin.charAt(i) == '1') {
				count++;
			}
			if (i == bin.length() - 1 || bin.charAt(i) == '0') {
				if (maxCount < count) {
					maxCount = count;
				}
				count = 0;
			}
		}
		System.out.println(maxCount);
	}
}
