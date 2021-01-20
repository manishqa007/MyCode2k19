package MySheetImportant;

public class MSI42_DecimalToHexaDecimal {

	public static void main(String[] args) {
		int decimal = 657, temp;
		String hexa = "";
		while(decimal>0) {
			temp = decimal%16;
			hexa = temp + hexa;
			decimal = decimal/16;
		}
		System.out.println("hexa value is: "+hexa);
	}
}
