package MySheetImportant;

public class MSI33_SumOfDigitsOfGivenNumber {

	public static void main(String[] args) {
		String str = "12345";
		int num = Integer.valueOf(str);
		int sum = 0;
		while (num>0) {
			sum = sum + num%10;
			num = num/10;
		}
		System.out.println("sum of digits in a  number is: "+sum);
	}
}