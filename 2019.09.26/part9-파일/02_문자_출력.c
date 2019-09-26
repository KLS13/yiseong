/*
	문자 출력 함수
	1. 콘솔 : putchar(문자)
	2. 파일 : fputc(문자, 스트림)

	int fputc(int ch, FILE* stream);
	1) 성공시 stram으로 전송한 ch가 그대로 리턴
	2) 실패시 EOF 리턴
	EOF = End Of File - int 상수값
*/
#include<stdio.h>

void main() {
	// 1. 파일 출력 스트림 만들기
	FILE* out = fopen("README.txt","w");

	// 스트림 문자 보내기
	fputc('A', out);
	fputc('B', out);
	fputc('C', out);
	fputc('\n',out);
	fputc('A', out);
	fputc('B', out);
	fputc('C', out);
	//스트림 삭제하기.
	fclose(out);
}