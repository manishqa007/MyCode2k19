package String;

/*
I/p: str = "geeks for geeks"
O/p: str = "gkees for gkees"
*/
public class String17_Reverse_ReverseEveryWordOfTheStringExceptTheFirstAndTheLastCharacter {

	public static void main(String[] args) {
			String str = "geeks for geeks";
			String strArr[] = str.split(" ");
			String temp = "", rev = "";
			
			for(int i = 0; i<strArr.length;i++) {
				temp = strArr[i];
				for (int j = 1; j < temp.length(); j++) {
					if(j==temp.length()-1)
						rev = temp.charAt(0) + rev + temp.charAt(temp.length()-1);
					else
						rev = temp.charAt(j) +rev ;
				}
				System.out.print(rev+" ");
				rev="";
			}
	}
}
