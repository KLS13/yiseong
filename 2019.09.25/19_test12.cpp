/*
	����. ����ü  account �� ����.
		- �ʵ�   : ���¹�ȣ, �ܾ�;
		- �޼ҵ� : 
			1) ���� ���� : create
			2) �Ա� : deposit
			3) ��� : withdraw
			4) ��ü : transfer
			5) ��ȸ : inquiry
*/

#include<stdio.h>
struct account{
	int creat;
	int money;

	void create(){
		printf("������ ���¹�ȣ : ");
		scanf_s("%d",&num1);

		printf("������ ���¹�ȣ : ");
		scanf_s("%d",&num2);

		printf("������ ���� %d \t %d \n", num1,num2);
	}



	void deposit() {
		int i;
		int j;
		
		printf("�Ա��� ���¹�ȣ��? ");
		scanf_s("%d",&i);
		printf("�Ա��� �ݾ���? ");
		scanf_s("%d",&j);
		if(i==num1 && j>=0){
			_money1 += j;
			printf("%d�� �ܾ��� %d",num1,_money1);
			}
		if(i==num2 && j>=0){
			_money2 += j;
			printf("%d�� �ܾ��� %d",num2,_money2);
			}
	}
	void withdraw() {
		int i;
		int j;
		printf("����� ���¹�ȣ��? ");
		scanf_s("%d",&i);
		printf("����� �ݾ���? ");
		scanf_s("%d",&j);
		if(i==num1 && j>=0){
			_money1 -= j;
			printf("%d�� �ܾ��� %d",num1,_money1);
			}
		if(i==num2 && j>=0){
			_money2 -= j;
			printf("%d�� �ܾ��� %d",num2,_money2);
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
	
	me.create("123", 1000);		// ���¹�ȣ: 123, �ܾ�: 1000��
	mom.create("456", 10000);	// ���¹�ȣ: 456, �ܾ�: 10000��

	me.deposit(-1000);			// �����ϸ� �� ��
	me.deposit(1000);			// ���¹�ȣ: 123, �ܾ�: 2000�� (�Ա� 1000��)

	me.withdraw(-1000);			// �����ϸ� �� ��
	me.withdraw(3000);			// �����ϸ� �� �� (�ܾ׺��� ū �ݾ� ���)
	me.withdraw(500);			// ���¹�ȣ: 123, �ܾ�: 1500�� (��� 500��)

	mom.transfer(me, 50000);	// �����ϸ� �� ��
	mom.transfer(me, 1000);		// mom �� me ���� 1000�� ��ü

	me.inquiry();				// ���¹�ȣ: 123, �ܾ�: 2500��
	mom.inquiry();				// ���¹�ȣ: 456, �ܾ�: 9000��
	
}
*/

/*

*/