/*
	#include <string.h>

	int strcmp(str1, str2);
	- 결과가 정수이다! 
	- 결과 : str1 - str2
	1) str1 > str2 : 양수
	2) str1 < str2 : 음수
	3) str2 == str2 : 0
*/
#include <stdio.h>
#include <string.h>

void main() {
	char id[100];

	fputs("아이디 입력 >> ", stdout);
	scanf("%s", id);	// scanf_s("%s", id) 사용 안 됨!

	// if (strcmp(id, "admin") == 0) { // strcmp() 가 false 이면
	if ( !strcmp(id, "admin") ) {
		puts("관리자입니다.");
	} else {
		puts("일반유저입니다.");
	}
}