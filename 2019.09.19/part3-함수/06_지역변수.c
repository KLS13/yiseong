/*
	1. 지역변수 (local variable)
		1) 선언 위치 : 코드블록 { } 의 시작부분
		2) 사용 범위 : 코드블록 { } 내에서만 사용
		3) 메모리    : 스택 영역

	2. 주요특징
		1) 코드 블록을 벗어나면 자동으로 소멸된다.
		2) 초기화하지 않으면 쓰레기다.
		3) 90% 이상 지역변수이다.
		4) argument = parameter = 매개변수

	*/
#include<stdio.h>
void increment(int);
int decrement(int);

void main() {
	int n = 10;
	increment(n);
	printf(" n : %d \n", n);
	n = decrement(n);
	printf(" %d \n", n);
}

void increment(int n){
	n++;
}
int decrement(int n){
	return n-1;
}
