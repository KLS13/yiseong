/*
	1. 메모리 (Memory)
		1) 주기억장치
		2) 램(RAM)
		3) 실행중인 모든걸 기억하는 장치
		4) 로딩(Loading) : 보조기억장치(하드) --> 주기억장치(램)
	2. 메모리 구조
		1) 1바이트 단위로 구분
		2) 1바이트마다 고유의 번호를 부여(16진수로 0부터 부여)
		3) 1바이트마다 고유의 번호 = 주소(번지)
		4) 주소연산자 : &n (변수 n의 주소)
	3. 16진수
		1) 16개의 숫자를 사용
		2) 0~9,A,B,C,D,E,F
		3) C표기법 : 0x(0X)로 시작
*/
#include<stdio.h>

void main() {
	int n = 10;
	printf("n : %d \n", n);
	printf("n의 주소 : %d \n", &n);
	printf("n의 주소 : %p \n", &n);
}