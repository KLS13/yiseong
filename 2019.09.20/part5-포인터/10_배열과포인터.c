/*
	�迭�� ������
	�迭 �ּҸ� ������ ������ ������ �� �迭 �̸��̴�.
	*/
#include<stdio.h>

void main() {
	int a[3] = { 10, 20, 30 };
	int *ptr;

	ptr = a; // ptr = &a[0];
	printf("%d %d %d \n", ptr[0],ptr[1],ptr[2]);

	printf("=======================\n");
	// C�迭������ �迭�� �ε��� ���� ( 0 ~ length-1)�� ����� üũ���� ����.
	// ( Boundary check ��� ����. )
	ptr[-1] = 40;
	ptr[3] = 50;
	printf("%d %d \n", ptr[-1], ptr[3]);
	printf("=======================\n");
}