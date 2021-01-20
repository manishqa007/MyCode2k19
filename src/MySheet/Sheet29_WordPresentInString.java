package MySheet;

public class Sheet29_WordPresentInString {

	public static void main(String[] args) {
		String str =  "All changes saved in drive";
		String arrStr[] = str.split(" ");
		String search = "in";
		for(int i = 0; i<arrStr.length;i++) {
			if(arrStr[i].equals(search)) {
				System.out.println("Word present");
			}
		}
	}
}
