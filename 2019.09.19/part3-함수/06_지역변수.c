/*
	1. �������� (local variable)
		1) ���� ��ġ : �ڵ��� { } �� ���ۺκ�
		2) ��� ���� : �ڵ��� { } �������� ���
		3) �޸�    : ���� ����

	2. �ֿ�Ư¡
		1) �ڵ� ����� ����� �ڵ����� �Ҹ�ȴ�.
		2) �ʱ�ȭ���� ������ �������.
		3) 90% �̻� ���������̴�.
		4) argument = parameter = �Ű�����

	*/
#include<stdio.h>
void increment(int);
int decrement(int);

void main() {
	int n = 10;
	increment(n);
	printf(" n : %d \n", n);
	n = decrement(n);
	printf(" %d \n", n);
}

void increment(int n){
	n++;
}
int decrement(int n){
	return n-1;
}
