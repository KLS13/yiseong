/*
	문제. 변수 n을 선언하고, 포인터 변수ptr을 통해 n 값을 1증가 출력
*/
#include<stdio.h>

void main() {
	int n = 10; // 이제 &n 는 사용이 가능하다. 
	int *ptr = &n;   // 포인터 변수 : ptr
	// ptr == &n

	/* ptr++; << 이건 주소의 증가 */
	//*ptr++;
	//*(ptr++);
	(*ptr)++;   //  *ptr == n

	printf(" n 값은 ? :%d \n", *ptr);
}

