package extends_test;

class Account {
	String numberNo;
	int money = 0;
	
	public Account() {
		System.out.println("Account 생성자 호출");
	}
	
	//입금 메소드
	public void deposit(int inputMoney) {
		money += inputMoney;
	}
}
	
class CheckCardAccount extends Account {
	String driectCardNo;
	int cardmoney;
	
	public CheckCardAccount() {
		System.out.println("CheckCardAccount 생성자 호출");
		}
	}
