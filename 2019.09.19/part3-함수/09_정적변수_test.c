/*
���� ������ (�����뿡 ���� ����) ��� �����ϴ� piggyBank �Լ� ����
piggyBank(10000); // ���� ������ 10000��
piggyBank(10000); // ���� ������ 20000��
*/

#include<stdio.h>

void piggyBank(int);

void main(){

	piggyBank(10000);
	piggyBank(5000);
	piggyBank(7000);
	piggyBank(500);
    piggyBank(100);
	piggyBank(14500);
	piggyBank(-500);
    piggyBank(-10000);
	piggyBank(-14500);
}


void piggyBank(int num){
	static int cash = 0;
	cash += num;
	printf("���� �ݾ� %d�� \t", num);
	printf("���� �����ݾ� %d��\n",cash);
}
