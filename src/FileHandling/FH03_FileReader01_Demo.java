package FileHandling;

import java.io.File;
import java.io.IOException;

//File reader and File writer is not recommended

public class FH03_FileReader01_Demo {

	public static void main(String[] args) throws IOException {
		File f  = new File("C:\\Users\\manishpatel\\Desktop\\File\\FileWrite\\Demo","tagg1.txt");
		System.out.println("Absolute path: "+ f.getAbsolutePath());
		if(f.createNewFile()) {
				System.out.println("File exist");
		}else {
				System.out.println("File already created");
		}
	}
}
