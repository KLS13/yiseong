/*
	�������� ( global variable )
		1) ������ġ : �ڵ��� { } �� �ٱ���
		2) ������ : ��� �ڵ� ��� { }
		3) �޸� ���� : ������ ����

	�ֿ�Ư¡
		1) ���α׷��� ����ɶ����� �Ҹ���� ����
		2) �ʱ�ȭ���� �ʾƵ� 0�̴�.
		3) ������ ������� ����.
		*/

#include<stdio.h>

int n;

void increment(void);

void main() {
	printf("%d \n", n);
	increment();
	printf("%d \n", n);
}

void increment(){
	int n=10;
	n++; //���������� ���ȴ�.
	
}