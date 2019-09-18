/*

            정수   실수
	더하기   +		+
	빼기	 -		-
	곱하기	 *		*
	나누기	없음	/
	몫		 /	   없음
	나머지	 %		%

	5/2 = 2  몫
	5%2 = 1  나머지
	5.0/2.0=2.5  나누기
	*/

#include<stdio.h>

int main() {
	int width;  //너비
	int height;  //높이
	int area;    //넓이

	width = 3;
	height = 4;
	area = width * height;

	printf("너비 : %d, 높이 : %d인 사각형 넓이는 %d이다 \n",width,height,area);
	return 0;
}