package Revision;

public class Rev04_Array_BreakingOfRupee {

	public static void main(String[] args) {
		int RsValue[] = { 1, 2, 5, 10, 20, 50, 100 };
		int value= 551;
		int temp = value;
		int rem = 0;
		int count = 0;
		for(int i = RsValue.length-1; i>=0;i--) {
			if(RsValue[i]<=temp) {
				rem = value%RsValue[i];
				count = temp/RsValue[i];
				System.out.println(RsValue[i]+": "+count);
				temp = rem;
			}
		}
	}
}
