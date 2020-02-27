package FileHandling;

import java.io.File;

public class FH01_File01_CheckFileAndFolderInADirectory {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\manishpatel\\Desktop\\qqqq\\MyCode2k19\\src\\resources");
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
