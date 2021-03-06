
public class Phone {

	// 버튼갯수
	int btnNum = 12;
	// 화면크기
	int displaySize;
	// 전화번호
	String number;
	
	// ** 생성자 **
	// 클래스에 대한 크기를 지정할때 필드값도 같이 지정할 수 있는 메소드
	// 필드값 : 클래스가 가지고 있는 변수 ex) btnNum, displaySize
	// 특징 : 리턴값(반환값) 자체가 없음 , 메소드 이름이 클래스 이름과 같다
	public Phone(int displaySize, String number) {
		this.displaySize = displaySize;
		this.number = number; 
		// this = 클래스 안의 같은 매개변수
	}
	// 문자를 전송하다
	public void msgSend() {
		System.out.println("문자를 전송하다");
	}
	// 전화를 걸다
	public void Call() {
		System.out.println("전화를 걸다");
	}
	// 인터넷에 연결하다
	public void Wifi() {
		System.out.println("인터넷 연결");
	}
	// 사진을 찍다
	public void Camera() {
		System.out.println("사진을 찍다");
	}
}
