import java.util.Scanner;

public class PigMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PigBank bank = new PigBank(1000);
		
		bank.showMoney(bank.money);
		// System.out.println("���� �ݾ�" + bank.money);
		
		System.out.print("�Աݾ� �Է� >> ");
		int inputMoney = sc.nextInt();
		bank.deposit(inputMoney);
		
		bank.showMoney(bank.money);
		
		// ������ �ݾ�
		System.out.print("��ݾ� �Է� >> ");
		int outMoney = sc.nextInt();
		// withDraw()
		bank.withDraw(outMoney);
		bank.showMoney(bank.money);
	}

}
