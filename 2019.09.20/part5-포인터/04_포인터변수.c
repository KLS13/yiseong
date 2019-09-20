/*
	1. 포인터 변수
		1) 주소를 저장할 수 있는 변수
		2) 변수 선언 시 변수명 앞에 * 를 붙임
	2. 주의
		1) 임의의 주소 저장은 불가능
		2) 선언된 변수의 주소는 사용
*/
#include <stdio.h>

void main() {
	int n = 10; // 이제 &n 는 사용이 가능하다.
	int *ptr;   // 포인터 변수 : ptr
	// ptr = 10;  ptr은 허가 받은 주소만 저장할 수 있다.

	ptr = &n;

	printf("n의 주소 : %p \n", &n);
	printf("n의 주소 : %p \n", ptr);

	printf("n : %d \n" , *(&n));
    printf("n : %d \n" , *ptr);
}
