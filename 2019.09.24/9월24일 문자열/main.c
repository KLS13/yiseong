/*
	main �Լ��� ���� �����ϴ� ���

	������Ʈ : Part6-���ڿ�
	���� : main.c
	1. ������	: main.obj
	2. ����		: Part6-���ڿ�.exe
	3. ����		: cmd â���� Part6-���ڿ�.exe ������ ����
*/
#include <stdio.h>

int main(int argc, char *argv[]) {

	int i;

	printf("���޵� �μ��� ���� : %d \n", argc);

	for (i = 0; i < argc; i++) {
		printf("%d��° �μ� : %s \n", i + 1, argv[i]);
	}

	return 0;

}