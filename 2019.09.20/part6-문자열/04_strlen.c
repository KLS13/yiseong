/*
	#include <string.h>

	strlen(문자열)
	: 문자열의 길이 반환 (글자 수)
*/
#include <stdio.h>
#include <string.h>

void main() {
	char id[100];	// 최대 99자 가능

	fputs("아이디 입력 >> ", stdout);
	fgets(id, sizeof(id), stdin);		// abc\n\0

	// fgets 를 사용하면 마지막 문자는 \n 라는 의미
	// 따라서, 제거하는 게 좋다.
	// 제거하자! (\n 자리에 \0 강제삽입)	// abc\0\0
	// a\n\0	-> id[1] = '\0';	strlen(id) : 2
	// ab\n\0	-> id[2] = '\0';	strlen(id) : 3
	// abc\n\0	-> id[3] = '\0';	strlen(id) : 4
	//             id[strlen(id)-1] = '\0';
	id[strlen(id)-1] = '\0';

	printf("아이디 길이 : %d \n", strlen(id));
	printf("아이디 : %s \n", id);
}