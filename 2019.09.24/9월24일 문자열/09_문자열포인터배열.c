#include <stdio.h>

void main() {
	//char *str1 = "Hello";
	//char *str2 = "Hello";
	//char *str3 = "Hello";
	char *subjects[3] = {"국어", "영어", "수학"};
	int i;

	printf("문자열1 : %s \n", subjects[0]);
	printf("문자열2 : %s \n", subjects[1]);
	printf("문자열3 : %s \n", subjects[2]);

	for (i = 0; i < 3; i++) {
		printf("%d번째 과목 : %s \n", i + 1, subjects[i]);
	}
}