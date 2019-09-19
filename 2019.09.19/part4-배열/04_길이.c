/*
 배열 길이
 선언 시 배열의 길이는 반드시 "상수"로 지정해야 한다.
 나중에 배열의 길이를 수정할 수 없다.
 int length = 10;
 int a[length]; //이런거 선언불가
 배열의 길이를 구하는 공식
 int a[3];
 sizeof(int) : 4 (int 의 크기)
 sizeof(a)   : 12(배열 a의 크기)
 즉,  sizeof(a) / sizeof(int) : 3 ( 배열의 길이 )
    
 */

#include<stdio.h>

void main() {
	int a[3] = {1, 2, 3};
	int i;
	int length = sizeof(a) / sizeof(int);

	for( i=0 ; i<length; i++){
		printf("%d ",a[i]);
	}
}