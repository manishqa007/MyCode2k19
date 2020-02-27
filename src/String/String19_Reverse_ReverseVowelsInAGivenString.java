package String;

/*
Input : hello world
Output : hollo werld
*/
public class String19_Reverse_ReverseVowelsInAGivenString {

	public static void main(String[] args) {
		String str = "hello world";
		String vowels = "";
		String temp="";
		for(int i = 0; i<str.length();i++) { // for vowels storage
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			vowels = str.charAt(i)+vowels;
		}
//		System.out.println("Vowels: "+vowels);
		
		int j=0;
		for(int i = 0; i<str.length();i++) { // for vowels reversal
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				temp = temp + vowels.charAt(j);
				j++;
			}
			else
				temp = temp + str.charAt(i);
		}
		System.out.println(temp);
	}

}
