/*
�� ������ �����ϸ� �� ������ ���� ��ȯ��Ű�� swqp �Լ� ����
*/
#include <stdio.h>

void swap(int *ptr,int *p) { 
	int temp;
	temp = *ptr;
	*ptr = *p;
	*p = temp;

}

void main() {
	int a= 10, b=20;
	printf("��ȯ �� : a = %d , b = %d \n", a,b); // 10, 20
	swap(&a,&b);
	printf("��ȯ �� : a = %d , b = %d \n", a,b); // 20, 10
}