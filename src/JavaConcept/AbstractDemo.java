package JavaConcept;

abstract class Abstract {

	public abstract int getNoOfWheels();

}

abstract class bus extends Abstract {

	public int getNoOfWheels() {
		return 6;
	}

	abstract String carColor();
}

class color extends bus {
	public String carColor() {
		return "red";
	}
}

public class AbstractDemo {
	public static void main(String args[]) {
		color obj = new color();
		obj.carColor();
		obj.getNoOfWheels();
	}
}