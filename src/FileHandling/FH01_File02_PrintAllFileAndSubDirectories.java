package FileHandling;

import java.io.File;

public class FH01_File02_PrintAllFileAndSubDirectories {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\manishpatel\\Desktop\\CSE");
		String s[] = f.list();
		for (String temp : s) {
			System.out.println(temp);
		}
	}
}
