/*
if문 : 조건식에 따라 분기문
	1. 사용형식
	if(조건식) {
	실행문;
	} else if(조건식) {
	실행문;
	}else{
	실행문;
	}
	*/

#include <stdio.h>
void main() {
	int num;
	printf("정수입력 : ");
	scanf_s("%d", &num);
	if( num>0 ) {
		printf("양수 \n");
	}else if(num==0) {
		printf("0 임 \n");
	}else{
		printf("음수 \n");
	}
}

