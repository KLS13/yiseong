// ����. �����͸� Ȱ���Ͽ� �ذ�
// ����. call by value ��� (�Լ��� ���� ����)
// increment(n);
// ���� : increment(&n)



#include<stdio.h>

void increment(int *ptr){  // int *ptr == &n
	// ptr == &n
	// *ptr == n
	(*ptr)++;
}

void main() {
	int n = 10;
	
	printf("���� �� : %d \n", n);
	increment(&n);
	printf("���� �� : %d \n", n);
}