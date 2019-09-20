/*
두 변수를 전달하면 두 변수의 값을 교환시키는 swqp 함수 구현
*/
#include <stdio.h>

void swap(int *ptr,int *p) { 
	int temp;
	temp = *ptr;
	*ptr = *p;
	*p = temp;

}

void main() {
	int a= 10, b=20;
	printf("교환 전 : a = %d , b = %d \n", a,b); // 10, 20
	swap(&a,&b);
	printf("교환 전 : a = %d , b = %d \n", a,b); // 20, 10
}