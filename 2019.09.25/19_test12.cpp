/*
	문제. 구조체  account 를 정의.
		- 필드   : 계좌번호, 잔액;
		- 메소드 : 
			1) 계좌 생성 : create
			2) 입금 : deposit
			3) 출금 : withdraw
			4) 이체 : transfer
			5) 조회 : inquiry
*/

#include<stdio.h>
struct account{
	int creat;
	int money;

	void create(){
		printf("생성할 계좌번호 : ");
		scanf_s("%d",&num1);

		printf("생성할 계좌번호 : ");
		scanf_s("%d",&num2);

		printf("생성된 계좌 %d \t %d \n", num1,num2);
	}



	void deposit() {
		int i;
		int j;
		
		printf("입금할 계좌번호는? ");
		scanf_s("%d",&i);
		printf("입금할 금액은? ");
		scanf_s("%d",&j);
		if(i==num1 && j>=0){
			_money1 += j;
			printf("%d의 잔액은 %d",num1,_money1);
			}
		if(i==num2 && j>=0){
			_money2 += j;
			printf("%d의 잔액은 %d",num2,_money2);
			}
	}
	void withdraw() {
		int i;
		int j;
		printf("출금할 계좌번호는? ");
		scanf_s("%d",&i);
		printf("출금할 금액은? ");
		scanf_s("%d",&j);
		if(i==num1 && j>=0){
			_money1 -= j;
			printf("%d의 잔액은 %d",num1,_money1);
			}
		if(i==num2 && j>=0){
			_money2 -= j;
			printf("%d의 잔액은 %d",num2,_money2);
			}
	}
	void inquiry(){
		printf("%d\t",_money1);
		printf("%d\n",_money2);
	}
};

void main() {
	account acc;
	acc.create();
	acc.deposit();
	acc.withdraw();
	acc.inquiry();
}

/*
#include <stdio.h>
struct account{


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

	mom.transfer(me, 50000);	// 동작하면 안 됨
	mom.transfer(me, 1000);		// mom 이 me 에게 1000원 이체

	me.inquiry();				// 계좌번호: 123, 잔액: 2500원
	mom.inquiry();				// 계좌번호: 456, 잔액: 9000원
	
}
*/

/*

*/