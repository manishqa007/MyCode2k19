package Tools;


public class Short {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 1, 9, 7, 8, 15, 13 };
			int max = arr[0], secMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				secMax = max;
				max = arr[i];
			}else if(arr[i]>secMax) {
				secMax = arr[i];
			}
		}
		System.out.println(max+" : "+secMax);
	}
}
