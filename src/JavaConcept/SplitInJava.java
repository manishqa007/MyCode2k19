package JavaConcept;

public class SplitInJava {

	public static void main(String args[]) {
		String str = "geekss@for@geekss";
		String[] arrOfStr = str.split("@");

		for (String a : arrOfStr)
			System.out.println(a);
	}

}
