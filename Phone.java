
public class Phone {

	// ��ư����
	int btnNum = 12;
	// ȭ��ũ��
	int displaySize;
	// ��ȭ��ȣ
	String number;
	
	// ** ������ **
	// Ŭ������ ���� ũ�⸦ �����Ҷ� �ʵ尪�� ���� ������ �� �ִ� �޼ҵ�
	// �ʵ尪 : Ŭ������ ������ �ִ� ���� ex) btnNum, displaySize
	// Ư¡ : ���ϰ�(��ȯ��) ��ü�� ���� , �޼ҵ� �̸��� Ŭ���� �̸��� ����
	public Phone(int displaySize, String number) {
		this.displaySize = displaySize;
		this.number = number; 
		// this = Ŭ���� ���� ���� �Ű�����
	}
	// ���ڸ� �����ϴ�
	public void msgSend() {
		System.out.println("���ڸ� �����ϴ�");
	}
	// ��ȭ�� �ɴ�
	public void Call() {
		System.out.println("��ȭ�� �ɴ�");
	}
	// ���ͳݿ� �����ϴ�
	public void Wifi() {
		System.out.println("���ͳ� ����");
	}
	// ������ ���
	public void Camera() {
		System.out.println("������ ���");
	}
}
