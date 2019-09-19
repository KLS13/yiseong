/*
	문제. 길이가 5인 배열을 선언하고, 사용자로부터 5개의 정수 입력받고
	해당 배열에 저장하고 출력

	*/

#include<stdio.h>
void main() {
	int a[5];
	int i;

	//1. 입력
	for(i=0 ; i<5 ; i++){
		printf("정수입력 :");
		scanf_s("%d",&a[i]);
		
	}

	for(i=0; i<5; i++){
		printf("%d ",a[i]);
	}
}
