package JavaConcept;

public class VarArg {

	public static void sum(int... a) {
		int sum = 0;
		for(int i: a) {
			sum = i+sum;
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		sum(10,20, 30);
		sum(10,70);


	}

}
