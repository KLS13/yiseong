package extends_test;
import extends_test.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		System.out.println("Account ����");
		System.out.println("===========");
		Account bank = new Account();
		bank.numberNo = "123456789";
		
		//�̼����� ���¹�ȣ , �Աݱݾ�
		System.out.println("�̼����� ���¹�ȣ : " + bank.numberNo);
		bank.deposit(20000);
		System.out.println("�̼����� �ܰ�Ȯ�� : " + bank.money);
		
		//Account�� ��ӹ��� Ŭ����
		System.out.println("CheckCardAccount ����");
		System.out.println("====================");
	
		CheckCardAccount cca = new CheckCardAccount();
		cca.numberNo = "666-999-444";
		
		//�ڹ����� ���¹�ȣ , �Աݱݾ�
		System.out.println("�ڹ����� ���¹�ȣ : " + cca.numberNo);
		cca.deposit(30000);
		System.out.println("�ڹ����� �ܰ�Ȯ�� : " + cca.money);
		
		cca.driectCardNo = "check-1234";
		System.out.println(cca.driectCardNo);
	}

}
