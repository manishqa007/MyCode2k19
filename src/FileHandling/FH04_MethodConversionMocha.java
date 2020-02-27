package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FH04_MethodConversionMocha {
		public static void main(String[] args) throws IOException {
			File f = new File("C:\\Users\\manishpatel\\Desktop\\temp","method.txt");
			f.mkdirs();
			System.out.println("Folder created");
			System.out.println("Absolute path:" +f.getAbsolutePath());
			
			String s[] = f.list(); // List all files and folder
			for(String x: s) {
				System.out.println(x);
			}
			
			f.createNewFile();//("methods.txt");
			if(f.createNewFile()) {
				System.out.println("File created");
			}else {
				System.out.println("File already exist");
			}
			System.out.println("Absolute path:" +f.getAbsolutePath());
			
			BufferedReader br = new BufferedReader(new FileReader(f)); 
			String str; 
			while ((str = br.readLine()) != null) {
			    System.out.println(str); 
			}
		}
}
