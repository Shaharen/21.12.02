
public class PhoneMain {

	public static void main(String[] args) {

		// Phone Ŭ���� ���
		// Ŭ������ ��ü��(������) = new Phone();
		int[] num = { 1, 2, 3 };
		
		Phone iPhone = new Phone(30, "22222");
		iPhone.number = "22222";
		iPhone.displaySize = 30;
		System.out.println(iPhone.number);
		iPhone.Camera();

		// default ������ : �ܼ��ϰ� ũ�⸸ ������
		// -> ���ο� �����ڰ� ����� default �����ڰ� ����� �����߻���
		// Phone galaxy = new Phone();
		Phone galaxy = new Phone(50, "1111111");
//		galaxy.number = "1111111";
//		galaxy.displaySize = 50;

		Phone lollipop = new Phone(10, "011");
//		lollipop.number = "011";
//		lollipop.displaySize = 10;
	}

}
