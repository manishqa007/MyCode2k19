package MySheetImportant;

public class MSI22_CheckNumberIsOddOrEvenWithoutModulus {

	public static void main(String[] args) {
		int num =6;
		boolean flag = checkEvenOdd(num);
		
		if(flag ==true)
		System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
	}

	private static boolean checkEvenOdd(int num) {
		boolean result = true;
		for (int i = 1; i <= num; i++) {
			result = !result;
		}
		return result;
	}

}
