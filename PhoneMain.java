
public class PhoneMain {

	public static void main(String[] args) {

		// Phone 클래스 사용
		// 클래스명 객체명(변수명) = new Phone();
		int[] num = { 1, 2, 3 };
		
		Phone iPhone = new Phone(30, "22222");
		iPhone.number = "22222";
		iPhone.displaySize = 30;
		System.out.println(iPhone.number);
		iPhone.Camera();

		// default 생성자 : 단순하게 크기만 전달함
		// -> 새로운 생성자가 생기면 default 생성자가 사라져 오류발생함
		// Phone galaxy = new Phone();
		Phone galaxy = new Phone(50, "1111111");
//		galaxy.number = "1111111";
//		galaxy.displaySize = 50;

		Phone lollipop = new Phone(10, "011");
//		lollipop.number = "011";
//		lollipop.displaySize = 10;
	}

}
