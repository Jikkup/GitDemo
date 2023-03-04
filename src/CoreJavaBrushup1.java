
public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		String website = "rahul shetty academy";
		char letter = 'r';
		double dec = 5.6;
		boolean mycard = true;
		System.out.println(num + "is the value stored in num varaiable");
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		int[] arr2 = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 122 };
		System.out.println(arr2[2]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		String[] name = { "rahul", "shetty", "selenium" };
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		for (String s : name) {
			System.out.println(s);
		}

	}

}
