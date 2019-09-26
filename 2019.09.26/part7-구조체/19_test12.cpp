/*
	문제. 구조체 account 를 정의하시오.
			- 필드 : 계좌번호, 잔액
			- 메소드
				1) 계좌 생성 : create
				2) 입금 : deposit
				3) 출금 : withdraw
				4) 이체 : transfer
				5) 조회 : inquiry
*/
#include <stdio.h>
#include <string.h>

struct account {
	// 필드
	int balance;	// long long balance;
	char number[20];

	// 메소드
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
		printf("계좌번호: %s, 잔액: %d원\n", number, balance);
	}
	void transfer(account* destination, int money) {
		// destination == &me
		// destination->멤버
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
	
	me.create("123", 1000);		// 계좌번호: 123, 잔액: 1000원
	mom.create("456", 10000);	// 계좌번호: 456, 잔액: 10000원

	me.deposit(-1000);			// 동작하면 안 됨
	me.deposit(1000);			// 계좌번호: 123, 잔액: 2000원 (입금 1000원)

	me.withdraw(-1000);			// 동작하면 안 됨
	me.withdraw(3000);			// 동작하면 안 됨 (잔액보다 큰 금액 출금)
	me.withdraw(500);			// 계좌번호: 123, 잔액: 1500원 (출금 500원)

	mom.transfer(&me, 50000);	// 동작하면 안 됨
	mom.transfer(&me, 1000);	// mom 이 me 에게 1000원 이체

	me.inquiry();				// 계좌번호: 123, 잔액: 2500원
	mom.inquiry();				// 계좌번호: 456, 잔액: 9000원
	
}