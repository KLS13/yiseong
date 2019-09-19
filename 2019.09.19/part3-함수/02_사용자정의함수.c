#include <stdio.h>

void subtractor(int, int);

void main() {
	int a,b;
printf("빼고자 하는 두 정수를 입력 ");
scanf_s("%d%d", &a,&b);
subtractor(a,b);
}


void subtractor(int first, int second){
	int different = first - second;
	printf("두 정수의 차이는 %d 이다. \n", different);
}