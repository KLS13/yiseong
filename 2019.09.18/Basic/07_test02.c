#include<stdio.h>
int main() {
	double num = 1.5;
	const double PI = 3.14;
	double cir, area;

	cir = 2*num*PI;
	area = num*num*PI;

	printf("반지름은 %.2lf, 원주율은 %lf, 원의 둘레는 %lf \n", num,PI,cir);
	printf("반지름은 %lf, 원주율은 %lf, 원의 넓이는 %lf \n", num,PI,area);
	return 0;

}

	