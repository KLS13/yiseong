/*
	1. 대입연산자
		1) = : 등호 오른쪽 값을 왼쪽으로 보낸다(저장한다.)
	2. 복합대입연산자
		1) += : 등호 오른쪽 값을 왼쪽에 더해준다.
		2) -= : 등호 오른쪽 값을 왼쪽에서 빼준다.
		3) *= :   
		4) /= : 
		5) %= :
*/

#include<stdio.h>
int main() {

	int piggyBank = 10000;
	piggyBank += 10000;
	piggyBank -= 15000;

	printf("%d원 \n",piggyBank);
	return 0;
}