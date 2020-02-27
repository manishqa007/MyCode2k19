package Adobe;

/*
	Input: geeks for geeks, Output: geeks
	Input: hello world,     Output: world    ["hello" and "world" both have 1 frequency. We print world as it comes last in the input array]
	Input: world wide fund, Output: fund
*/

//NOTE: If multiple words have same frequency, then print the word whose first occurence occurs last in the array as compared to the other strings with same frequency.
public class String09_MostFrequentWordInAnArrayOfStrings {

	public static void main(String[] args) {
		String str = "geeks for geeks";
		String arrStr[] = str.split(" ");
		String maxOccuranceStr="";
		int count=0,max=count;
		for(int i = 0 ; i<arrStr.length;i++) {
			count = 1;
			for(int j = i+1 ; j<arrStr.length;j++) {
				if(arrStr[i].equals(arrStr[j])) {
					count++;
				}
			}
			if(count>=max) {
				max = count;
				maxOccuranceStr = arrStr[i];
			}
		}
		System.out.println(maxOccuranceStr+" : "+max);
	}

}
