package Misclleneous;

public class Misc14_Pending_MaximumCountOfCylinder {

	public static void main(String[] args) {
		int currentQuantity[] = { 3, 2, 4 };
		int maxQuantity[] = { 3, 5, 6 }; // assuming it is sorted in ascending order
		int totalCurrentQuantity = 0, maxCylinderCount=0;

		for (int i = 0; i < currentQuantity.length; i++) {
			totalCurrentQuantity += totalCurrentQuantity + currentQuantity[i];
		}

		for (int i = maxQuantity.length - 1; i >= 0; i--) {
			
			for (int j = i; j >= 0; j--) {
				  
			}
		}

	}

}
