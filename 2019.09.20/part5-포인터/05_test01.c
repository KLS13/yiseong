/*
	����. ���� n�� �����ϰ�, ������ ����ptr�� ���� n ���� 1���� ���
*/
#include<stdio.h>

void main() {
	int n = 10; // ���� &n �� ����� �����ϴ�. 
	int *ptr = &n;   // ������ ���� : ptr
	// ptr == &n

	/* ptr++; << �̰� �ּ��� ���� */
	//*ptr++;
	//*(ptr++);
	(*ptr)++;   //  *ptr == n

	printf(" n ���� ? :%d \n", *ptr);
}

