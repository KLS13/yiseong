/*
	형식 입력 함수
	1. 콘솔 : scanf("형식",주소)
	2. 파일 : fscanf(스트림, "형식", 주소)

	char* fgets(char* str, int maxCount, File* stream);
	
	1) 성공시 실제 읽어들인 데이터 개수 리턴
	2) 실패시 EOF 리턴
*/

#include<stdio.h>

void main() {
	FILE* in = fopen("MIDTERM.txt", "r");
	int kor, eng, mat;
	double ave;

	if(in==NULL) {
		printf("파일 오픈 오류 \n");
		return;
	}
	//fscanf(in, "%d%d%d%lf", &kor,&eng, &mat, &ave);
	fscanf(in, "%d,%d,%d,%lf", &kor,&eng, &mat, &ave);

	printf("국어 : %d점 \n", kor);
	printf("영어 : %d점 \n", eng);
	printf("수학 : %d점 \n", mat);
	printf("평균 : %lf점 \n", ave);

	fclose(in);
}