/*
	���� ��� �Լ�
	1. �ܼ� : printf("����",��)
	2. ���� : fprintf(��Ʈ��, "����", ��)

	int fprintf(FILE* stream, const char* format,,,,);

	1) ������ ��µ� ������ ���� ����
	2) ���н� ���� ����
	
*/
#include <stdio.h>

void main() {
	FILE* out = fopen("MIDTERM.txt","w");
	int kor, eng, mat;
	double ave;

	if(out==NULL) {
		printf("���� ���� ���� \n");
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
