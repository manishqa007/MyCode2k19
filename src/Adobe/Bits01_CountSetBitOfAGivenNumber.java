package Adobe;

public class Bits01_CountSetBitOfAGivenNumber {

	public static void main(String[] args) {
		System.out.println("Set bit count: " + setBitCount_Method1(1101)); // without shifting
		System.out.println("Set bit count: " + setBitCount_Method2(13)); // with shift operator
	}

	private static int setBitCount_Method2(int n) { //13=1101
		 int count = 0; 
	        while (n > 0) { 
	            count =count + (n & 1); 
	            System.out.println((n & 1)+">>>>>>>"+count);
	            n >>= 1; 
	        } 
	        return count; 
	}

	private static int setBitCount_Method1(int binNo) {
		String bits = String.valueOf(binNo);
		int count = 0;
		for (int i = 0; i < bits.length(); i++) {
			if (bits.charAt(i) == 49) //(Character.getNumericValue(bits.charAt(i)) == 1)
				count++;
		}
		return count;
	}
}
