/*
	���� ��� �Լ�
	1. �ܼ� : putchar(����)
	2. ���� : fputc(����, ��Ʈ��)

	int fputc(int ch, FILE* stream);
	1) ������ stram���� ������ ch�� �״�� ����
	2) ���н� EOF ����
	EOF = End Of File - int �����
*/
#include<stdio.h>

void main() {
	// 1. ���� ��� ��Ʈ�� �����
	FILE* out = fopen("README.txt","w");

	// ��Ʈ�� ���� ������
	fputc('A', out);
	fputc('B', out);
	fputc('C', out);
	fputc('\n',out);
	fputc('A', out);
	fputc('B', out);
	fputc('C', out);
	//��Ʈ�� �����ϱ�.
	fclose(out);
}