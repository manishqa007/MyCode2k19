package String;

/*
Given a string consisting of 1 and 0, the task is to find out the maximum power of jump required to reach the end of the string. At a time you can jump from one 1 to next 1 or from one 0 to next 0.
Note: Power of jump is defined as the distance between two consecutive 1’s or two consecutive 0’s
Question link: https://www.geeksforgeeks.org/maximum-power-of-jump-required-to-reach-the-end-of-string/

I/p: 11110, O/p: 5
I/p: 10101, O/p: 5
I/p: 101011, O/p: 6
*/
public class String01_MaximumPowerOfJumpRequiredToReachTheEndOfString {

	public static void main(String[] args) {
		String str = "101011";
		int len = str.length();
		char jumpOn = str.charAt(len-1) == '1' ?  '1': '0';
		System.out.println("Jump path via: "+jumpOn);
		int jumpPower=0,currentJump=0;
		for(int i = 0;i<len;i++) {
			if(str.charAt(i)==jumpOn) {
				currentJump++;
				jumpPower=jumpPower+currentJump;
				currentJump=0;
			}else
				currentJump++;
		}
		System.out.println("Maximum power of jump required: "+jumpPower);
	}
}

//for (int i = 1; i < str.length(); i++) {
//if(str.charAt(i+1)=='1') {
//	jump++;
//}
//}
//System.out.println("Jump: "+jump);
