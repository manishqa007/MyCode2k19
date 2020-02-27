package Misclleneous;

public class Misc13_SumOfCubeOfNNumber {

	public static void main(String[] args) {
		int num = 5;
		System.out.println("Sum of cube of " + num + " numbers is: " + cubeSum(num));
	}

	private static double cubeSum(int num) {
		double sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + Math.pow(i, 3);
		}
		return sum;
	}
}
