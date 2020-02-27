package Adobe;

import java.util.Scanner;

//In this problem,a ching S is composed of lowercase alphabets and wildcard characters i.e.'?'.Here,'?'can be replaced by any of the lowercase alphabets.Now you have to classify the given ching on the basis of following rules:
//If there are more than 3 consonants together or more than 5 vowels together,the ching is considered to be"BAD".A ching is considered"GOOD"only if it is not“BAD”.
public class String11_GoodOrBadString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = input.nextLine();
		System.out.println("Entered String is: "+str);
		char ch[] = str.toCharArray();
		int countVowel = 0, countConsonant = 0;
		boolean flag=true;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o'|| ch[i] == 'u') {
				countVowel++;
				if (countVowel > 5) {
					System.out.println("BAD  String");
					flag=false;
					break;
				}
				countConsonant = 0;
			} else if (ch[i] != 'a' || ch[i] != 'e' || ch[i] != 'i' || ch[i] != 'o'|| ch[i] != 'u' && ch[i] != '?') {
				countConsonant++;
				if (countConsonant >=3) {
					System.out.println("BAD  String");
					flag=false;
					break;
				}
				countVowel = 0;
			}else if(ch[i] == '?') {
				countVowel++;
				countConsonant++;
				if(countVowel>5 || countConsonant>2) {
					System.out.println("BAD  String");
					flag=false;
					break;
				}
			}
		}
		if(flag==true)
				System.out.println("GOOD  String");
	}
}
