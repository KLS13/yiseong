/*
do~while문 : 반복 횟수가 명확하지 않은 경우에 적합
			 반드시 1회 이상 실행이 필요한 경우에 사용

			 1. 사용형식
			 do {
				반복실행문;
				}while(조건식); // 세미콜론 반드시 필요
				*/

#include<stdio.h>
void main() {
	int num =1;

	do{
		printf("%d \n",num);
		num++;
	}while(num<=5);
}