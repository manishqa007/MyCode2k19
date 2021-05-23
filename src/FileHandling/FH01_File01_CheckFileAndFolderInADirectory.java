package FileHandling;

import java.io.File;

public class FH01_File01_CheckFileAndFolderInADirectory {

	public static void main(String[] args) {
		File f = new File("D:\\Professional Document");
		System.out.println("Path: "+f.getAbsolutePath());
		if(f.exists()) {
			System.out.println("The files / folder exist in directory: "+f.getName()+" are: ");
			String temp[] = f.list();
			for(String x: temp) {
				System.out.println(x);
			}
			
		}else {
			System.out.println("No file exist");
		}
	}

}
