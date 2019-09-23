/*
	문제. 저장된 문장에서 동일한 단어 찾기
		- 대소문자 구분 함
	실행 예)
	단어 입력 >> korea
	해당 단어가 있습니다.
	힌트) 공백을 찾아서 \0 문자를 넣는 방식
*/
#include <stdio.h>
#include <string.h>

void main() {
	char str[] = "republic of korea";
	char word[100];
	int i;		// str의 인덱스
	int isExist = 0;	// 0, 1 (존재하지 않는다, 존재한다)

	// 1. 입력부터 받자.
	fputs("단어 입력 >> ", stdout);
	scanf("%s", word);

	// 2. 마지막 글자부터 첫 글자까지 순회
	for (i = strlen(str)-1; i >= 0; i--) {
		// 3. 한 글자씩 꺼내서 공백인지 비교
		// 한 글자 : str[i], 공백 : ' ' => 문자 비교에서 동등 비교(==)
		if (str[i] == ' ') {
			// 4. str[i] : 공백
			//    str[i+1] : 비교할 단어의 첫 글자
			if ( !strcmp(word, &str[i+1]) ) {	// strcmp( &word[0], &str[i+1] )
				isExist = 1;	// 존재한다.
				break;			// 그만 찾자!
			} else {
				// 공백 자리에 널 문자 강제 삽입하기
				str[i] = '\0';
			}
		}
	}

	// 5. 반복문이 종료되면 첫 단어만 비교할 대상으로 남는다.
	if ( !isExist ) {	// 아직 존재하는 단어가 없었다는 의미
		if ( !strcmp(word, str) ) {		// strcmp(&word[0], &str[0])
			isExist = 1;
		}
	}

	// 6. isExist 확인
	if ( isExist ) {
		puts("해당 단어가 있습니다.");
	} else {
		puts("해당 단어가 없습니다.");
	}

}