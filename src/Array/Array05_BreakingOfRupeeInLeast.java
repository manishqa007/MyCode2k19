package Array;

public class Array05_BreakingOfRupeeInLeast {
	public static void main(String[] args) {
		int RsValue[] = { 1, 2, 5, 10, 20, 50, 100 };
		int amoutToBreak = 1065;
		int temp = amoutToBreak;
		for (int i = RsValue.length - 1; i >= 0; i--) {
			temp = temp % RsValue[i];
			if (((amoutToBreak - temp) / RsValue[i]) != 0)
				System.out.println("Number of " + RsValue[i] + " note is " + ((amoutToBreak - temp) / RsValue[i]));
			amoutToBreak = temp;
			if (temp < 1)
				break;
		}
	}
}
