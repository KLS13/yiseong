/*
	문자열 출력 함수
	1. 콘솔 : puts(문자열)
	2. 파일 : fputs(문자열, 스트림)

	int fputs(const char* str, FILE* stream);
	1) 성공시 음수가 아닌 값을 리턴
	2) 실패시 EOF 리턴
	EOF = End Of File - int 상수값
*/
#include <stdio.h>

int main() {
	FILE* out = fopen("log.txt", "w");
	if(out==NULL){
		printf("파일 생성 오류 \n");
		return -1; //비정상 종료
	}
	fputs("Hello", out);
	fputs(" World!\n", out);
	fputs("2019-09-27 \n", out);

	fclose(out);

	return 0;
}	