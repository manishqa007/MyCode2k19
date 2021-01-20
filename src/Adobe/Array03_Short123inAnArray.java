package Adobe;

//1. If the element is 0 then swap the element with the element at index low and update low = low + 1 and mid = mid + 1
//2. If the element is 1 then update mid = mid + 1
//3. If the element is 2 then swap the element with the element at index high and update high = high – 1 and update i = i – 1. As the swapped element is not processed
public class Array03_Short123inAnArray {

	public static void main(String[] args) {
		int arr[] = {1,0,2,1,1,0,2,0,0,1};
		int lo = 0, mid = 0, high = arr.length-1, temp;
		while(mid<=high) {
			if(arr[mid]==0) {
				temp = arr[lo];
				arr[lo] = arr[mid];
				arr[mid] = temp;
				lo++;
				mid++;
			}else if(arr[mid]==1) {
				mid++;
			}else {
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
