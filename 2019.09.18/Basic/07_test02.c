#include<stdio.h>
int main() {
	double num = 1.5;
	const double PI = 3.14;
	double cir, area;

	cir = 2*num*PI;
	area = num*num*PI;

	printf("�������� %.2lf, �������� %lf, ���� �ѷ��� %lf \n", num,PI,cir);
	printf("�������� %lf, �������� %lf, ���� ���̴� %lf \n", num,PI,area);
	return 0;

}

	