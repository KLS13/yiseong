/*
	#include <string.h>

	int strcmp(str1, str2);
	- ����� �����̴�! 
	- ��� : str1 - str2
	1) str1 > str2 : ���
	2) str1 < str2 : ����
	3) str2 == str2 : 0
*/
#include <stdio.h>
#include <string.h>

void main() {
	char id[100];

	fputs("���̵� �Է� >> ", stdout);
	scanf("%s", id);	// scanf_s("%s", id) ��� �� ��!

	// if (strcmp(id, "admin") == 0) { // strcmp() �� false �̸�
	if ( !strcmp(id, "admin") ) {
		puts("�������Դϴ�.");
	} else {
		puts("�Ϲ������Դϴ�.");
	}
}