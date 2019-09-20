// 문제. 포인터를 활용하여 해결
// 기존. call by value 방식 (함수에 값을 전달)
// increment(n);
// 개선 : increment(&n)



#include<stdio.h>

void increment(int *ptr){  // int *ptr == &n
	// ptr == &n
	// *ptr == n
	(*ptr)++;
}

void main() {
	int n = 10;
	
	printf("증가 전 : %d \n", n);
	increment(&n);
	printf("증가 후 : %d \n", n);
}