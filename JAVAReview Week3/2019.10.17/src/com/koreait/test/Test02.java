package com.koreait.test;

/*
 * DepositException : 마이너스 입금 처리, 예외 코드 1000
 * WithdrawException : 	잔액초과 출금 처리, 예외 코드 2000
 * 						마이너스 출금 처리, 예외 코드 2001
 */


class BankAccount {
	
	// Field
	private String no;
	private long balance;
	
	// Constructor
	public BankAccount(String no, long balance) {
		this.no = no;
		this.balance = balance;
	}
	
	// Method
	// 1. 입금
	public void deposit(long money) throws DepositException {
		if (money < 0) {
			throw new DepositException(1000, "0보다 작으면 입금 불가!");
		}
		balance += money;
	}
	// 2. 출금
	public void withdraw(long money) throws WithdrawException {
		if (money > balance) {
			throw new WithdrawException(2000, "잔액보다 크면 출금 불가!");
		} else if (money < 0) {
			throw new WithdrawException(2001, "0보다 작으면 출금 불가!");
		}
		balance -= money;
	}
	// 3. 조회
	public void inquiry() {
		System.out.println("계좌번호 : " + no);
		System.out.println("계좌잔액 : " + balance);
	}
	// 4. 이체
	public void transfer(BankAccount account, long money) throws DepositException, WithdrawException {
		withdraw(money);
		account.deposit(money);
	}
	
}


class BankAccountException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int errCode;
	
	public BankAccountException(int errCode, String message) {
		super(message);
		this.errCode = errCode;
	}
	public int getErrCode() {
		return errCode;
	}
	
}


class DepositException extends BankAccountException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DepositException(int errCode, String message) {
		super(errCode, message);
	}
	
}


class WithdrawException extends BankAccountException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public WithdrawException(int errCode, String message) {
		super(errCode, message);
	}

}


public class Test02 {

	public static void main(String[] args) {

		BankAccount parent = new BankAccount("123-456", 10000);
		BankAccount child = new BankAccount("654-321", 0);
		
		try {
			parent.deposit(10000);
			parent.inquiry();
			parent.withdraw(10000);
			parent.inquiry();
			parent.transfer(child, 5000);	// parent -> child 에게 5000 이체
			parent.inquiry();
			child.inquiry();
		} catch (BankAccountException e) {
			System.out.println("에러 메시지 : " + e.getMessage() + "(코드 : " + e.getErrCode() + ")");
		}
		
	}

}








