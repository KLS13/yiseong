#include<stdio.h>
int main() {
	// 1. 이스케이프 문자(특수문자)
	
	printf("Hello World! \n");
	printf("Hello  \"World!\" \n");
	printf("Hello  \'World!\' \n");
	printf("A\tA\n");
	printf("AA\tA\n");
	printf("AAA\tA\n");
	printf("AAAA\tA\n");

	// 2. 포맷코드 : 중요
	// 정수/실수/문자/문자열 --> 자료형 4개

	printf("정수코드 : %d \n", 123);
	printf("실수코드 : %f \n", 3.14);
	printf("문자코드 : %c \n", 'A'); // 한글불가
	printf("문자열코드 : %s \n", "asd");
	return 0;
}