/*
	변수의 생성과 소멸
	                 < 생성 >		< 소멸 >		 	 < 사용영역 >
	1. 지역변수  {						}			 	 스택
	2. 전역변수  프로그램 시작       프로그램 종료       데이터
	3. 동적할당  malloc 실행		 free 실행			 힙(heap)
*/
#include<stdio.h>
#include<stdlib.h>

void main() {
	// int형 변수를 동적할당으로 생성
	int* ptr;
	// ptr = 새로 만든 공간(변수)의 주소!
	// ptr = malloc(4);  //4바이트 공간을 동적할당한다.
	// ptr = malloc(sizeof(int)); // 정수 크기를 동적할당한다.
	ptr = (int*)malloc(sizeof(int)); // 정수를 저장할 정수 크기를 동적할당한다.
	//동적할당 공간 활용
	*ptr = 12345;
	printf("%d \n", *ptr);
	free(ptr);

}