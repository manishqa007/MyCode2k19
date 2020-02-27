package FileHandling;

import java.io.File;
import java.io.IOException;

public class FH01_File03_CreateFileAndFolder {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\manishpatel\\Desktop\\temp");
		f.mkdirs();
		System.out.println("Folder created");
		f.createNewFile();
		System.out.println("Path:" +f.getAbsolutePath());
		String s[] = f.list();
		for(String x: s) {
			System.out.println(x);
		}
	}

}
