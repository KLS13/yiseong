#include <stdio.h>

void main() {
	//char *str1 = "Hello";
	//char *str2 = "Hello";
	//char *str3 = "Hello";
	char *subjects[3] = {"����", "����", "����"};
	int i;

	printf("���ڿ�1 : %s \n", subjects[0]);
	printf("���ڿ�2 : %s \n", subjects[1]);
	printf("���ڿ�3 : %s \n", subjects[2]);

	for (i = 0; i < 3; i++) {
		printf("%d��° ���� : %s \n", i + 1, subjects[i]);
	}
}