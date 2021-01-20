package Tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MochaDescribeItSyntax {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\manishpatel\\Desktop\\Mocha_LP", "qpv1_bergerca.txt");
		System.out.println("Absolute path: " + f.getAbsolutePath());
		if (f.createNewFile()) {
			System.out.println("File exist");
		} else {
			System.out.println("File already created");
		}

		BufferedReader br = new BufferedReader(new FileReader(f));
		String st;
		int tcid = 3079453;
		while ((st = br.readLine()) != null) {
			System.out.println("it(\""+st.trim()+"\",function(){"+"\r\n"+"classutitlity.tcidMapping('"+tcid++ +"')"+"\r\n\n"+"})"+"\n");
		}

	}
}
