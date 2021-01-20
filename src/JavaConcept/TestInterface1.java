package JavaConcept;

interface Car {
	void getNoOfWheels(); // by default public nd abstract
}

class ImplementInterfaceClass implements Car {
	public void getNoOfWheels() {
		System.out.println("6");
	}
}

public class TestInterface1 {
	public static void main(String args[]) {
		ImplementInterfaceClass obj = new ImplementInterfaceClass();
		obj.getNoOfWheels();
	}
}
