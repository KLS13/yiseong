/*
	1. ǥ�� �Է� ��Ʈ�� : stdin  -> Ű����
	2. ǥ�� ��� ��Ʈ�� : stdout -> �����
*/
#include <stdio.h>

void main() {
	char * str1 = "james";
	char * str2 = "alice";
	char * str3 = "john";

	printf("��� : %s \n", str1);

	printf("��� : ");
	puts(str2);		// put(���) + string(���ڿ�)
					// �ڵ����� �� �ٲ� ó���� �� �ش�.

	printf("��� : ");
	fputs(str3, stdout);	// f(���Ͻ�Ʈ��) + put(���) + string(���ڿ�)
							// �� �ٲ� ó���� ���� �ʴ´�.

}