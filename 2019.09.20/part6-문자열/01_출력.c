/*
	1. 표준 입력 스트림 : stdin  -> 키보드
	2. 표준 출력 스트림 : stdout -> 모니터
*/
#include <stdio.h>

void main() {
	char * str1 = "james";
	char * str2 = "alice";
	char * str3 = "john";

	printf("출력 : %s \n", str1);

	printf("출력 : ");
	puts(str2);		// put(출력) + string(문자열)
					// 자동으로 줄 바꿈 처리를 해 준다.

	printf("출력 : ");
	fputs(str3, stdout);	// f(파일스트림) + put(출력) + string(문자열)
							// 줄 바꿈 처리는 되지 않는다.

}