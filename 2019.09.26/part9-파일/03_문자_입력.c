/*
	���� �Է� �Լ�
	1. �ܼ� : ���� = getchar()
	2. ���� : ���� = fgetc(��Ʈ��)

	int fgetc(FILE* stream);
	
	1) ������ stream���� ���� ���� ����
	2) ���н� EOF ����
	EOF : End Of File - int �����
*/
#include <stdio.h>

void main() {
	// 1. ���� �Է� ��Ʈ�� �����
	FILE* in = fopen("README.txt", "r");
	int ch;

	// 2. ��Ʈ������ ���� �б�
	while (1) {
		ch = fgetc(in);		// �� ���ڸ� �о� �鿩��
		if (ch == EOF) {	// ������ ���� �����ϸ�
			break;			// �׸�!
		}
		// printf("%c", ch);	// �ܼ�(ȭ��)�� ���
		fputc(ch, stdout);	// ch�� stdout(ǥ����½�Ʈ��:�����)�� ���
	}

	// 3. ��Ʈ�� �����ϱ�
	fclose(in);

}