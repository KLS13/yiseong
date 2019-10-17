package com.koreait.test;

/*
 * DepositException : ���̳ʽ� �Ա� ó��, ���� �ڵ� 1000
 * WithdrawException : 	�ܾ��ʰ� ��� ó��, ���� �ڵ� 2000
 * 						���̳ʽ� ��� ó��, ���� �ڵ� 2001
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
	// 1. �Ա�
	public void deposit(long money) throws DepositException {
		if (money < 0) {
			throw new DepositException(1000, "0���� ������ �Ա� �Ұ�!");
		}
		balance += money;
	}
	// 2. ���
	public void withdraw(long money) throws WithdrawException {
		if (money > balance) {
			throw new WithdrawException(2000, "�ܾ׺��� ũ�� ��� �Ұ�!");
		} else if (money < 0) {
			throw new WithdrawException(2001, "0���� ������ ��� �Ұ�!");
		}
		balance -= money;
	}
	// 3. ��ȸ
	public void inquiry() {
		System.out.println("���¹�ȣ : " + no);
		System.out.println("�����ܾ� : " + balance);
	}
	// 4. ��ü
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
			parent.transfer(child, 5000);	// parent -> child ���� 5000 ��ü
			parent.inquiry();
			child.inquiry();
		} catch (BankAccountException e) {
			System.out.println("���� �޽��� : " + e.getMessage() + "(�ڵ� : " + e.getErrCode() + ")");
		}
		
	}

}








