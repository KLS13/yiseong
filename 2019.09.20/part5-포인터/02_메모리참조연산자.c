/*	
	1. 주소
		& 연산자를 변수명 앞에 붙여서 주소를 알아낸다.
	2. 참조
		* 연산자를 주소 앞에 붙이면 해당 주소에 저장된 메모리 공간에 접근한다.

	*/
#include<stdio.h>

void main() {
	int n = 10;
	printf("n : %d \n", n);
	printf("n의 주소 : %p \n", &n);
	printf("n : %d \n", *(&n));
}