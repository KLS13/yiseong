/*
	���� �Է� �Լ�
	1. �ܼ� : scanf("����",�ּ�)
	2. ���� : fscanf(��Ʈ��, "����", �ּ�)

	char* fgets(char* str, int maxCount, File* stream);
	
	1) ������ ���� �о���� ������ ���� ����
	2) ���н� EOF ����
*/

#include<stdio.h>

void main() {
	FILE* in = fopen("MIDTERM.txt", "r");
	int kor, eng, mat;
	double ave;

	if(in==NULL) {
		printf("���� ���� ���� \n");
		return;
	}
	//fscanf(in, "%d%d%d%lf", &kor,&eng, &mat, &ave);
	fscanf(in, "%d,%d,%d,%lf", &kor,&eng, &mat, &ave);

	printf("���� : %d�� \n", kor);
	printf("���� : %d�� \n", eng);
	printf("���� : %d�� \n", mat);
	printf("��� : %lf�� \n", ave);

	fclose(in);
}