package String;

/*
I/p: str = “geeks quiz practice code”
O/p: str = “code practice quiz geeks”
*/
public class String20_Reverse_ReverseWordsInAGivenString {

	public static void main(String[] args) {
		String str = "geeks quiz practice code";
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			 if(str.charAt(i)==32 || i==0) {
				 System.out.print(temp+" ");
				 temp="";
			 }
			 
			 if(str.charAt(i)!=32) {
				 temp = str.charAt(i) + temp;
			 }
		}
	}
}
