/*
	����. ����ü account �� �����Ͻÿ�.
			- �ʵ� : ���¹�ȣ, �ܾ�
			- �޼ҵ�
				1) ���� ���� : create
				2) �Ա� : deposit
				3) ��� : withdraw
				4) ��ü : transfer
				5) ��ȸ : inquiry
*/
#include <stdio.h>
#include <string.h>

struct account {
	// �ʵ�
	int balance;	// long long balance;
	char number[20];

	// �޼ҵ�
	void create(char num[], int bal) {
		strcpy(number, num);
		balance = bal;
	}
	void deposit(int money) {
		if (money < 0) { return; }
		balance += money;
	}
	void withdraw(int money) {
		if (money < 0 || balance < money) { return; }
		balance -= money;
	}
	void inquiry() {
		printf("���¹�ȣ: %s, �ܾ�: %d��\n", number, balance);
	}
	void transfer(account* destination, int money) {
		// destination == &me
		// destination->���
		if (balance < money) { return; }
		// balance -= money;
		// destination->balance += money;

		withdraw(money);
		destination->deposit(money);

	}
};

void main() {
	account me;
	account mom;
	
	me.create("123", 1000);		// ���¹�ȣ: 123, �ܾ�: 1000��
	mom.create("456", 10000);	// ���¹�ȣ: 456, �ܾ�: 10000��

	me.deposit(-1000);			// �����ϸ� �� ��
	me.deposit(1000);			// ���¹�ȣ: 123, �ܾ�: 2000�� (�Ա� 1000��)

	me.withdraw(-1000);			// �����ϸ� �� ��
	me.withdraw(3000);			// �����ϸ� �� �� (�ܾ׺��� ū �ݾ� ���)
	me.withdraw(500);			// ���¹�ȣ: 123, �ܾ�: 1500�� (��� 500��)

	mom.transfer(&me, 50000);	// �����ϸ� �� ��
	mom.transfer(&me, 1000);	// mom �� me ���� 1000�� ��ü

	me.inquiry();				// ���¹�ȣ: 123, �ܾ�: 2500��
	mom.inquiry();				// ���¹�ȣ: 456, �ܾ�: 9000��
	
}