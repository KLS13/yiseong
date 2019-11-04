package extends_test;
import extends_test.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		System.out.println("Account 내용");
		System.out.println("===========");
		Account bank = new Account();
		bank.numberNo = "123456789";
		
		//이성은행 계좌번호 , 입금금액
		System.out.println("이성은행 계좌번호 : " + bank.numberNo);
		bank.deposit(20000);
		System.out.println("이성은행 잔고확인 : " + bank.money);
		
		//Account를 상속받은 클래스
		System.out.println("CheckCardAccount 내용");
		System.out.println("====================");
	
		CheckCardAccount cca = new CheckCardAccount();
		cca.numberNo = "666-999-444";
		
		//자바은행 계좌번호 , 입금금액
		System.out.println("자바은행 계좌번호 : " + cca.numberNo);
		cca.deposit(30000);
		System.out.println("자바은행 잔고확인 : " + cca.money);
		
		cca.driectCardNo = "check-1234";
		System.out.println(cca.driectCardNo);
	}

}
