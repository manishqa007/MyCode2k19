package Revision;

public class Rev01_LeaderInAnArray {

	public static void main(String[] args) {
		int result;
		int arr[] = {15, 19, 7, 14, 8, 6, 3, 13};
		result = leaderNN(arr); // O(n^2)
		System.out.println("\n---------------------------------");
		result = leaderN(arr);  // O(n)
		System.out.println("");
	}
	
	public static int leaderNN(int temp[]) { // {15, 19, 7, 14, 8, 6, 3, 13}
		boolean flag=false;
		int i,j;
		for(i = 0; i<temp.length;i++) {
			for(j = i; j<temp.length;j++) {
				if(temp[i]>=temp[j]) {
					flag=true;
				}else {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.print(temp[i]+" ");
				flag=false;
			}
		}
		return 1;
	}
	
	public static int leaderN(int temp[]) { // {15, 19, 7, 14, 8, 6, 3, 13}
		int len= temp.length;
		int max = temp[len-1];
		System.out.print(max+" ");
		for(int i = len-2; i>=0;i--) {
			if(temp[i]>max) {
				max=temp[i];
				System.out.print(max+" ");
			}
		}
		return 0;
		
	}
}