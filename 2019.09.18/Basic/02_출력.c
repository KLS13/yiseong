#include<stdio.h>
int main() {
	// 1. �̽������� ����(Ư������)
	
	printf("Hello World! \n");
	printf("Hello  \"World!\" \n");
	printf("Hello  \'World!\' \n");
	printf("A\tA\n");
	printf("AA\tA\n");
	printf("AAA\tA\n");
	printf("AAAA\tA\n");

	// 2. �����ڵ� : �߿�
	// ����/�Ǽ�/����/���ڿ� --> �ڷ��� 4��

	printf("�����ڵ� : %d \n", 123);
	printf("�Ǽ��ڵ� : %f \n", 3.14);
	printf("�����ڵ� : %c \n", 'A'); // �ѱۺҰ�
	printf("���ڿ��ڵ� : %s \n", "asd");
	return 0;
}