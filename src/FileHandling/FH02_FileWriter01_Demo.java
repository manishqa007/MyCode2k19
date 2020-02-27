package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File reader and File writer is not recommended

public class FH02_FileWriter01_Demo {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\manishpatel\\Desktop\\File\\FileWrite\\Demo");
		if(f.exists()) {
			System.out.println("Folder already Exist");
		}else {
			f.mkdirs();  
			System.out.println("Folder created");
		}
		FileWriter writer = new FileWriter("C:\\Users\\manishpatel\\Desktop\\File\\FileWrite\\Demo\\demo.txt");
		writer.write("1");
		writer.write("\n");
		writer.write("qwer");
		writer.write("\n");
		writer.write("Its me");
		writer.write("\n");
		writer.write("asdv");
		writer.write("\n");
		writer.flush();
		writer.close();
	}
}
