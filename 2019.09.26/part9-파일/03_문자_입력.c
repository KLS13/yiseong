/*
	문자 입력 함수
	1. 콘솔 : 변수 = getchar()
	2. 파일 : 변수 = fgetc(스트림)

	int fgetc(FILE* stream);
	
	1) 성공시 stream으로 읽은 문자 리턴
	2) 실패시 EOF 리턴
	EOF : End Of File - int 상수값
*/
#include <stdio.h>

void main() {
	// 1. 파일 입력 스트림 만들기
	FILE* in = fopen("README.txt", "r");
	int ch;

	// 2. 스트림에서 문자 읽기
	while (1) {
		ch = fgetc(in);		// 한 글자만 읽어 들여서
		if (ch == EOF) {	// 파일의 끝에 도달하면
			break;			// 그만!
		}
		// printf("%c", ch);	// 콘솔(화면)에 출력
		fputc(ch, stdout);	// ch를 stdout(표준출력스트림:모니터)에 출력
	}

	// 3. 스트림 삭제하기
	fclose(in);

}