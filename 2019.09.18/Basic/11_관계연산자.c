/*
1. 관계연산자                  2. 논리연산자
	1) >= : 크거나 같다.			&& : AND
	2) >  : 크다.					|| : OR
	3) <= : 작거나 같다.			! : NOT ( 조건식의 결과를 반대로 )
	3) <  : 작다
	5) == : 같다
	6) != : 같지 않다

3. 조건식의 결과
	1) 참   : 1 ( 0만 아니면 모두 참 ) --> true
	2) 거짓 : 0   --> false

*/
#include<stdio.h>
int main() {
	int a = 10;
	int b = 11;
	int c = (a==b);

	printf("%d \n", c);
}