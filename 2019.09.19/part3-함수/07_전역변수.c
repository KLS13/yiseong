/*
	전역변수 ( global variable )
		1) 선언위치 : 코드블록 { } 의 바깥쪽
		2) 사용범위 : 모든 코드 블록 { }
		3) 메모리 영역 : 데이터 영역

	주요특징
		1) 프로그램이 종료될때까지 소멸되지 않음
		2) 초기화하지 않아도 0이다.
		3) 가급적 사용하지 말것.
		*/

#include<stdio.h>

int n;

void increment(void);

void main() {
	printf("%d \n", n);
	increment();
	printf("%d \n", n);
}

void increment(){
	int n=10;
	n++; //지역변수가 사용된다.
	
}