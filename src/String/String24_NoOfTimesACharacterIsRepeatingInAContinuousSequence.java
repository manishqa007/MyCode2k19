package String;

// i/p: "BBAACCA"
// o/p: "B2A2C2A1"

public class String24_NoOfTimesACharacterIsRepeatingInAContinuousSequence {

	public static void main(String[] args) {
		String str = "BBAAACC";
		/*String output = */characterIsRepeatingInAContinuousSequence(str);
//		System.out.println(output);
	}

	private static void characterIsRepeatingInAContinuousSequence(String input) {
		for(int i=0; i<input.length(); i++) {
			int count =1;
			 for(int j=i+1; j<input.length(); j++) {
				 if(input.charAt(i)==input.charAt(j))
					 count++;
				 else {
					 System.out.print((char)input.charAt(i)+""+count);
					 i=j-1;
					 break;
				 }
			 }
		}
	}
}