/*���� �Է� >> 3
�Է¹��� ������ 3�̴� */

#include<stdio.h>

void input(int *ptr){
	printf("���� �Է� : ");
	scanf_s("%d",ptr);
}
void print(int *ptr){
	printf("�Է¹��� ������ %d �̴� \n", *ptr);
}


void main() {
	int n;
	input(&n);
	print(&n);
}