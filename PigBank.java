
public class PigBank {

	int money;

	public PigBank(int money) {
		this.money = money;
	}

	// 돈을 넣는다
	public void deposit(int inputMoney) {

		this.money += inputMoney;
	}

	// 돈을 인출한다
	public void withDraw(int outMoney) {
		this.money -= outMoney;
	}

	// 돈을 출력하는 메소드 showMoney()
	public void showMoney(int money) {
		System.out.println("현재 금액 : " + money);
	}
}
