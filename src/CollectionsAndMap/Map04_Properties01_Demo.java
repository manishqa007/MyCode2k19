package CollectionsAndMap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Map04_Properties01_Demo {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("/MyCode2K19/src/CollectionsAndMap/Config.properties");
		
		p.load(fis);
		System.out.println(p);
		
		String s = p.getProperty("server");
		System.out.println(s);
		
		p.setProperty("product", "LP");
		
		FileOutputStream fos = new FileOutputStream("Config.properties");
		p.store(fos,"Updated by Manish");
	}

}
