/*
	배열과 포인터
	배열 주소를 저장한 포인터 변수는 곧 배열 이름이다.
	*/
#include<stdio.h>

void main() {
	int a[3] = { 10, 20, 30 };
	int *ptr;

	ptr = a; // ptr = &a[0];
	printf("%d %d %d \n", ptr[0],ptr[1],ptr[2]);

	printf("=======================\n");
	// C계열에서는 배열의 인덱스 범위 ( 0 ~ length-1)를 벗어나도 체크하지 않음.
	// ( Boundary check 기능 없음. )
	ptr[-1] = 40;
	ptr[3] = 50;
	printf("%d %d \n", ptr[-1], ptr[3]);
	printf("=======================\n");
}