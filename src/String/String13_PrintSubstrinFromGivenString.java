package String;

public class String13_PrintSubstrinFromGivenString {

	public static void main(String[] args) {
		String str ="ABCD";
		String temp ="";
		for(int i = 0 ; i<4;i++) {
			for(int j=i;j<4;j++) {
				temp = temp +str.charAt(j);
				System.out.println(temp);
			}
			temp="";
		}
	}

}
