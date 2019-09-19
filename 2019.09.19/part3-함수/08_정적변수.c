/*
	정적 변수 (static variable)
		1) 선언 위치 : 코드블록 { }의 시작부분 ==> 지역변수
		2) 사용 범위 : 코드블록 { } 내에서만 ==> 지역변수
		3) 메모리 영역 : 데이터 영역         ==> 전역변수

	주요 특징
		1)코드 블록을 벗어나도 소멸되지 않는다.
		2)초기화 하지 않아도 0 이다.
		3)특정지역에서 사용함*/

#include<stdio.h>
//int i; // 전역변수
void call(void);

void main() {
	int n;
	for (n=0; n<5; n++) {
		call();
	}
}

void call(){
	//int i = 0; // 지역변수는 call()을 벗어나면 소멸.
	static int i=0; //정적 변수이기때문에 call()함수를 벗어나서 메인에서 돌아도 값 유지~
	i++;
	printf("%d번째 호출이다 \n", i);
}