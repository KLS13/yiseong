#include <stdio.h>

void subtractor(int, int);

void main() {
	int a,b;
printf("������ �ϴ� �� ������ �Է� ");
scanf_s("%d%d", &a,&b);
subtractor(a,b);
}


void subtractor(int first, int second){
	int different = first - second;
	printf("�� ������ ���̴� %d �̴�. \n", different);
}