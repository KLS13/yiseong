/*
	���ڿ� ��� �Լ�
	1. �ܼ� : puts(���ڿ�)
	2. ���� : fputs(���ڿ�, ��Ʈ��)

	int fputs(const char* str, FILE* stream);
	1) ������ ������ �ƴ� ���� ����
	2) ���н� EOF ����
	EOF = End Of File - int �����
*/
#include <stdio.h>

int main() {
	FILE* out = fopen("log.txt", "w");
	if(out==NULL){
		printf("���� ���� ���� \n");
		return -1; //������ ����
	}
	fputs("Hello", out);
	fputs(" World!\n", out);
	fputs("2019-09-27 \n", out);

	fclose(out);

	return 0;
}	