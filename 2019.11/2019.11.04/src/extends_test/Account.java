package extends_test;

class Account {
	String numberNo;
	int money = 0;
	
	public Account() {
		System.out.println("Account ������ ȣ��");
	}
	
	//�Ա� �޼ҵ�
	public void deposit(int inputMoney) {
		money += inputMoney;
	}
}
	
class CheckCardAccount extends Account {
	String driectCardNo;
	int cardmoney;
	
	public CheckCardAccount() {
		System.out.println("CheckCardAccount ������ ȣ��");
		}
	}
