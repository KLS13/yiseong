/*
for문 : 시작/종료가 명확한 경우에 사용하는 반복문

1. 사용 형식
for문 ( 초기문 ; 조건식 ; 반복후 실행) {
반복실행문;
}

2. 동작 순서
초기문 -> 조건식 -> 반복실행문 -> 반복후실행 -> 조건식 -> ...

*/

#include <stdio.h>
void main() {
	
	int n;
	for ( n=1 ; n<=5 ; n++){
	
		printf("%d\n",n);
	}

	for ( n=0 ; n<5; n++) {
		printf("hello\n");
		}
		
	}
