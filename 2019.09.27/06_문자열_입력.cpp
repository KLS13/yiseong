/*
	���ڿ� �Է� �Լ�
	1. �ܼ� : gets(�迭)
	2. ���� : fgets(�迭, �ִ����, ��Ʈ��)

	char* fgets(char* str, int maxCount, File* stream);
	
	1) ������ ���� �о���� str ����
	2) ���н� NULL ����
*/
#include<stdio.h>

void main() {
	FILE* in = fopen("log.txt", "r");
	char* ptr;
	char str[5];
	if (in == NULL) {
		printf("���� ���� ���� \n");
		return;
	}
	while(1){
		ptr = fgets(str,sizeof(str),in);
		if( ptr == NULL ) {
			break;
		}
		printf("%s", str); // 	fputs(str, stdout); (O),  puts(str);  (X)  
														//puts�� �ڵ����� �ٹٲ��� ���ԵǼ� �ǵ��� ������� ����
	}
}