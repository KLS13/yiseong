package com.koreait.test;



/*
 * BankAccountException : DepositException �� WithdrawException �� �θ�Ŭ����
 * DepositException : ���̳ʽ� �Ա� ó��, ���� �ڵ� 1000
 * WithdrawException : 	�ܾ��ʰ� ��� ó��, ���� �ڵ� 2000
 * 						���̳ʽ� ��� ó��, ���� �ڵ� 2001
 * 
 * 		Exception					Exception(String message) { }
 * 
 * 		��
 * 
 * 		BankAccountException		BankAccountException(int errCode, String message) {
 * 										super(message);		// Exception(String message) { }
 * 										this.errCode = errCode;
 * 									}
 * 		��	��
 * 		�� 
 * 		��	DepositException		DepositException(int errCode, String message) {
 * 		��								super(errCode, message);	// BankAccountException(errCode, message);
 * 		��							}
 * 		
 * 		WithdrawException			WithdrawException(int errCode, String message) {
 * 										super(errCode, message);	// BankAccountException(errCode, message);
 * 									}
 * 
 */


class BankAccount2 {
	
	// Field
	private String no;
	private long balance;
	
	// Constructor
	public BankAccount2(String no, long balance) {
		this.no = no;
		this.balance = balance;
	}
	
	// Method
	// 1. �Ա�
	public void deposit(long money) throws DepositException2 {
		if (money < 0) {
			throw new DepositException2(1000, "0���� ������ �Ա� �Ұ�!");
		}
		balance += money;
	}
	// 2. ���
	public void withdraw(long money) throws WithdrawException2 {
		if (money > balance) {
			throw new WithdrawException2(2000, "�ܾ׺��� ũ�� ��� �Ұ�!");
		} else if (money < 0) {
			throw new WithdrawException2(2001, "0���� ������ ��� �Ұ�!");
		}
		balance -= money;
	}
	// 3. ��ȸ
	public void inquiry() {
		System.out.println("���¹�ȣ : " + no);
		System.out.println("�����ܾ� : " + balance);
	}
	// 4. ��ü
	public void transfer(BankAccount2 account, long money) throws DepositException2, WithdrawException2 {
		withdraw(money);
		account.deposit(money);
	}
	
}


class BankAccountException_2 extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int errCode;
	
	public BankAccountException_2(int errCode, String message) {
		super(message);
		this.errCode = errCode;
	}
	public int getErrCode() {
		return errCode;
	}
	
}


class DepositException2 extends BankAccountException_2 {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DepositException2(int errCode, String message) {
		super(errCode, message);
	}
	
}


class WithdrawException2 extends BankAccountException_2 {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public WithdrawException2(int errCode, String message) {
		super(errCode, message);
	}

}


public class Test02_2 {

	public static void main(String[] args) {
		
		BankAccount2 parent = new BankAccount2("123-456", 10000);
		BankAccount2 child = new BankAccount2("654-321", 0);
		
		try {
			parent.deposit(10000);
			parent.inquiry();
			parent.withdraw(10000);
			parent.inquiry();
			parent.transfer(child, 5000);	// parent -> child ���� 5000 ��ü
			parent.inquiry();
			child.inquiry();
		} catch (BankAccountException_2 e) {
			System.out.println("���� �޽��� : " + e.getMessage() + "(�ڵ� : " + e.getErrCode() + ")");
		}

	}

}
