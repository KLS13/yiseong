/*
	main 함수에 값을 전달하는 방법

	프로젝트 : Part6-문자열
	파일 : main.c
	1. 컴파일	: main.obj
	2. 빌드		: Part6-문자열.exe
	3. 실행		: cmd 창에서 Part6-문자열.exe 파일을 실행
*/
#include <stdio.h>

int main(int argc, char *argv[]) {

	int i;

	printf("전달된 인수의 갯수 : %d \n", argc);

	for (i = 0; i < argc; i++) {
		printf("%d번째 인수 : %s \n", i + 1, argv[i]);
	}

	return 0;

}