/*
	#include <string.h>

	strlen(���ڿ�)
	: ���ڿ��� ���� ��ȯ (���� ��)
*/
#include <stdio.h>
#include <string.h>

void main() {
	char id[100];	// �ִ� 99�� ����

	fputs("���̵� �Է� >> ", stdout);
	fgets(id, sizeof(id), stdin);		// abc\n\0

	// fgets �� ����ϸ� ������ ���ڴ� \n ��� �ǹ�
	// ����, �����ϴ� �� ����.
	// ��������! (\n �ڸ��� \0 ��������)	// abc\0\0
	// a\n\0	-> id[1] = '\0';	strlen(id) : 2
	// ab\n\0	-> id[2] = '\0';	strlen(id) : 3
	// abc\n\0	-> id[3] = '\0';	strlen(id) : 4
	//             id[strlen(id)-1] = '\0';
	id[strlen(id)-1] = '\0';

	printf("���̵� ���� : %d \n", strlen(id));
	printf("���̵� : %s \n", id);
}