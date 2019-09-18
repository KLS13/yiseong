#include<stdio.h>
int main()  {
	/* 변수크기
		1) char		  1바이트 (크기 고정, 영문 1바이트, 한글 2바이트)
		2) int		  4바이트 (크기 가변, 4바이트 기준 : -21억 ~ 21억)
		3) long		  4바이트 
		4) long long  8바이트
		5) float      4바이트 ( 소수 6자리 유효 )
		6) double     8바이트 ( 소수 15자리 유효 )

		정수형 변수 크기
		1) 운영체제 + 컴파일러(VS)에 의해 결정된다.
		2) char <= short <= int <= long <= long long  < 크기 순 >
		3) 변수 크기 확인 연산자 : sizeof
	*/

printf("char 크기 : %d \n", sizeof(char));
printf("int 크기 : %d \n", sizeof(int));
printf("double 크기 : %d \n", sizeof(double));

}