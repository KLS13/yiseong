#include<stdio.h>
int main() {
	int a = 10;
	int b = 10;

	printf("a++ = %d \n", a++); //후위증가 ( a++ ) : 나중에 증가
	printf("a = %d \n", a);
	printf("b++ = %d \n", ++b); //전위증가 ( b++ ) : 먼저 증가
	
	return 0;
}
