package MySheet;

public class Sheet07_NumberOf1inBinaryString {

	public static void main(String[] args) {
		String str = "1011100101001";
		int count = 0;
		for(int i =0 ; i<str.length();i++) {
			if(str.charAt(i)=='1') {
				count++;
			}
		}
		System.out.println("1's count: "+count);
	}

}
