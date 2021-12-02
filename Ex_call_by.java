
public class Ex_call_by {

	public static void main(String[] args) {
		// call by
		int num1 = 30;
		int[] numArray = { 1, 2 };
		change(num1);
		change2(numArray);
		System.out.println("�ٲﰪ >> " + num1); // 30
		//-> call by value
		System.out.println("�ٲﰪ >> " + numArray[0]); // 10
		// -> call by reference
	}

	public static void change(int num) {
		num = 10;
	}
	public static void change2(int[] numArray) {
		numArray[0] = 10;
	}
}
