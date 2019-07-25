package String;

public class String10_ReverseStringByMaintainingItsSpacePositon {

	public static void main(String[] args) {
		String str = "I love India";
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=32)
			temp = str.charAt(i) + temp;
		}
		System.out.println(" Reversre without gap: "+temp);
		for (int j = 0; j < str.length(); j++) {
			if(str.charAt(j)==32) {
				System.out.print(" ");
			}else {
				System.out.print(temp.charAt(j));
			}
		}
		
	}
}
