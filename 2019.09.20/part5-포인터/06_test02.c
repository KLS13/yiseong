// ���� n�� �����ϰ�  ����ڷκ��� n�� ���� �Է¹޾� ����ϱ�

#include<stdio.h>
void main() {
	int n;
	int *ptr = &n;

	printf("�����Է� : ");
	scanf_s("%d", ptr);  // 	scanf_s("%d", &n); �� �Ȱ���.

	printf(" ����� : %d \n", *ptr);  //*ptr == n
}