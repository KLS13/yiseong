/*
돈을 넣으면 (저금통에 값을 전달) 계속 누적하는 piggyBank 함수 구현
piggyBank(10000); // 현재 누적액 10000원
piggyBank(10000); // 현재 누적액 20000원
*/

#include<stdio.h>

void piggyBank(int);

void main(){

	piggyBank(10000);
	piggyBank(5000);
	piggyBank(7000);
	piggyBank(500);
    piggyBank(100);
	piggyBank(14500);
	piggyBank(-500);
    piggyBank(-10000);
	piggyBank(-14500);
}


void piggyBank(int num){
	static int cash = 0;
	cash += num;
	printf("넣은 금액 %d원 \t", num);
	printf("현재 누적금액 %d원\n",cash);
}
