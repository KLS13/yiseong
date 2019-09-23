/*
	문제. 아이디를 입력받아 아이디의 이상 유무 출력
	      - 아이디는 5 ~ 20자 사이만 가능
		  - "정상 id입니다", "잘못된 id입니다"
*/
#include <stdio.h>
#include <string.h>

void main() {
	char id[21];

	fputs("아이디 입력 >> ", stdout);
	// scanf("%s", id);
	fgets(id, sizeof(id), stdin);

	id[strlen(id)-1] = '\0';

	if ( strlen(id) >= 5 && strlen(id) <= 20 ) {
		puts("정상 id입니다");
	} else {
		puts("잘못된 id입니다");
	}
}