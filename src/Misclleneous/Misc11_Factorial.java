package Misclleneous;

// 6! = 6*5*4*3*2*1 => 720
public class Misc11_Factorial {

	public static void main(String[] args) {
		int num = 4;
		System.out.println("Factorial of "+num+": "+factorial(num));
		System.out.println("Factorial of "+num+": "+factorialRecurssion(num));
		}
	
	private static int factorial(int num) {
		int factorial=1;
		for(int i =1; i<=num; i++){	
				factorial = factorial*i;
		}
		return factorial;
	}

	private static int factorialRecurssion(int num) {
		if(num==1)
			return 1;
		else
		return num * factorialRecurssion(num-1);
	}
}
