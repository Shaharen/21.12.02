
public class PigBank {

	int money;

	public PigBank(int money) {
		this.money = money;
	}

	// ���� �ִ´�
	public void deposit(int inputMoney) {

		this.money += inputMoney;
	}

	// ���� �����Ѵ�
	public void withDraw(int outMoney) {
		this.money -= outMoney;
	}

	// ���� ����ϴ� �޼ҵ� showMoney()
	public void showMoney(int money) {
		System.out.println("���� �ݾ� : " + money);
	}
}
