package String;

public class String08_MaxNumberOfConsecutiveOne {

	public static void main(String[] args) {
		String str = "1101010100011101001111110001111111";
		int temp, max;
		temp = max = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 49) {
				temp++;
			}
			if (i == str.length() - 1 || str.charAt(i) == 48) {
				if (temp > max) {
					max = temp;
				}
				temp = 0;
			}
		}
		System.out.println("Max consecutive 1's: " + max);
	}
}
