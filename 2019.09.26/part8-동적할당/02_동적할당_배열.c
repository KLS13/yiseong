/*
	1~100���� ��� ������ �����Ϸ��� �Ѵ�.
	���� ���·� ��� ������ �����Ѵٰ� �����ϸ�,
	int a[100]; -> �ִ� ���̷� �����ϰ� ����ߴ�.

	�����Ҵ��� Ȱ���ϸ�
	����Ҷ����� ���� Ȯ���ϸ� ��!

	*/
#include <stdio.h>
#include <stdlib.h>

void main() {
	int* ptr;
	int length;
	int i;

	printf("���ϴ� �迭�� ���̸� �Է� >> ");
	scanf_s("%d", &length);

	ptr = (int*)malloc(sizeof(int)*length);

	for(i=0 ; i<length; i++) {
		ptr[i] = (i+1) * 10;
		printf("%d \n", ptr[i]);
	}
	free(ptr);
}