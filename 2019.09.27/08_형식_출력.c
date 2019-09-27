/*
	형식 출력 함수
	1. 콘솔 : printf("형식",값)
	2. 파일 : fprintf(스트림, "형식", 값)

	int fprintf(FILE* stream, const char* format,,,,);

	1) 성공시 출력된 문자의 개수 리턴
	2) 실패시 음수 리턴
	
*/
#include <stdio.h>

void main() {
	FILE* out = fopen("MIDTERM.txt","w");
	int kor, eng, mat;
	double ave;

	if(out==NULL) {
		printf("파일 생성 오류 \n");
		return;
	}

	kor = 80;
	eng = 81;
	mat = 82;
	ave = (kor + eng + mat) /3.0;

	//fprintf(out,"%d %d %d %f\n", kor,eng,mat,ave);
	fprintf(out,"%d,%d,%d,%f\n", kor,eng,mat,ave);

	fclose(out);
}
