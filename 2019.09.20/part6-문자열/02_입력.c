#include <stdio.h>

void main() {
	char str1[20];
	char str2[20];
	char str3[20];

	printf("성명 입력 >> ");
	scanf("%s", str1);	// scanf("%s", &str1[0]);
						// 공백 문자(스페이스, 탭, 엔터)를 입력 받지 못한다.
	printf("입력 받은 성명 : %s \n", str1);

	fflush(stdin);		// stdin (표준 입력 스트림: 버퍼) 비우기

	printf("성명 입력 >> ");
	gets(str2);		// get(입력) + s(문자열)
					// 공백 문자(스페이스, 탭, 엔터)도 입력 받는다.
	printf("입력 받은 성명 : ");
	puts(str2);

	printf("성명 입력 >> ");
	fgets(str3, sizeof(str3), stdin);	// f(파일스트림) + get(입력) + s(문자열)
										// 공백 문자(스페이스, 탭, 엔터)도 입력 받는다.
	//   (저장배열, 최대길이, 스트림)
	//   최대길이 : 널 문자 포함해서 최대길이 계산(실제 입력은 19자까지)
	printf("입력 받은 성명 : ");
	fputs(str3, stdout);

}