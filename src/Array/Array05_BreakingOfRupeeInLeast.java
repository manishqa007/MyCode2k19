package Array;

public class Array05_BreakingOfRupeeInLeast {
	public static void main(String[] args) {
		int RsValue[] = { 1, 2, 5, 10, 20, 50, 100 };
		int amoutToBreak = 1065;
		int temp = amoutToBreak;
		for (int i = RsValue.length - 1; i >= 0; i--) {
			if(temp>=RsValue[i]) {
				System.out.println("Number of "+RsValue[i]+" note is: "+temp/RsValue[i]);
				temp = temp%RsValue[i];
			}
		}
	}
}
