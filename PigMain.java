import java.util.Scanner;

public class PigMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PigBank bank = new PigBank(1000);
		
		bank.showMoney(bank.money);
		// System.out.println("현재 금액" + bank.money);
		
		System.out.print("입금액 입력 >> ");
		int inputMoney = sc.nextInt();
		bank.deposit(inputMoney);
		
		bank.showMoney(bank.money);
		
		// 인출할 금액
		System.out.print("출금액 입력 >> ");
		int outMoney = sc.nextInt();
		// withDraw()
		bank.withDraw(outMoney);
		bank.showMoney(bank.money);
	}

}
