package Tools;

public class temp {

	public static void main(String[] args) {
		String arr[] = { "AB", "CD", "DE", "EF", "BC"}; // op: AB BC CD DE EF

		String order = arr[0];
		String temp = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == "$")
				continue;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == "$")
					continue;
				temp = arr[j];
				if (!order.equals(temp) && order.charAt(order.length()-1)==temp.charAt(0)) {
							order = order +" => "+ temp;
				}
			}
			System.out.println(order);
		}
	}
}