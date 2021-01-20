package MySheet;

public class Sheet26_SecondLargestNoUsingSingleLoop {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 2, 1, 7, 6, 4 ,8, 8 };
		int max=0,secondMax=0;
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				secondMax = max;
				max = arr[i];
			}else if(secondMax<arr[i] && arr[i]!=max) {
				secondMax = arr[i];
			}
		}
		System.out.println(max+" "+secondMax);
	}

}
