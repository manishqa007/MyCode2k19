package Misclleneous;

public class Misc01_SwapTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {
		int a,b;
		a=3;
		b=7;
		b=b+a;//Math.abs(b-a); // a=3, b=10
		a=b-a;//Math.abs(a+b); // a=4, b=10
		System.out.println("a: " + a + " b: "+b);
	}
}