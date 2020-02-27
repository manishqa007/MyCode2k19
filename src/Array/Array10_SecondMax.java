package Array;

public class Array10_SecondMax {

	public static void main(String[] args) {
		int arr[] = { -2,-200,-100,-1};
		int max=arr[0], secMax = arr[1],temp;
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			if (temp > max) {
				secMax= max;
				max =temp;
			}else if(temp< max && temp> secMax) {
				secMax = temp;
			}
		}
		System.out.println(secMax+" "+ max);
	}

}
