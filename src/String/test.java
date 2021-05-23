package String;

public class test {

	public static void main(String[] args) {
		String arr[]={"BC","DE","AB","CD", }; // op: AB=BC=CD=DE
//		BCCDDE  AB
   //
		String order = "";
		String temp = "";
		String res = "";
		for(int i = 0; i<arr.length;i++){
			order = arr[i];
			for(int j = 0;j<arr.length;j++){
				temp = arr[j];
				System.out.println(order.charAt(0)+"==="+temp.charAt(temp.length()-1));
					if(!order.equals(temp)){
						if(order.charAt(0)==temp.charAt(temp.length()-1)) {
							res = res+  order +temp+"==>";
						}
					}else if(order.charAt(0)==temp.charAt(temp.length()-1)) {
						
					}
					
			}
		}
		System.out.print(res);
	}

}
