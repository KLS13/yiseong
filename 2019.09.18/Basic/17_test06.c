//�������� �Է¹޾� �ѷ��� ���̸� ����ϴ� ���α׷�.

#include<stdio.h>
#include<math.h>
#define PI 3.14

void main() {
	double ban = 0;
	double triArea=0;
	int width = 0, height = 0;
	int kor=0,eng=0,mat=0;
	
	
	printf("�������� �Է��ϼ��� :", ban);
	scanf_s("%lf", &ban);
	printf("���� ���̴� : %lf\n", pow(ban,2)*PI);
	printf("\n");

	printf("�ʺ�� ���̸� �Է��ϼ��� :", width, height);
	scanf_s("%d %d", &width,&height);
	triArea = width*height/2.0;
	printf("�ﰢ�� ���̴� %lf\n", triArea);
	printf("\n");

	printf("����, ����, ���� �Է� : ", kor,eng,mat);
	scanf_s("%d %d %d", &kor, &eng, &mat);
	(kor+eng+mat)/3.0 >= 80 ? printf("�հ�\n") : printf("���հ�\n");
	
}