/*
길이가 5인 배열 선언, 사용자로부터 5개의 정수를 입력받아
해당 배열에 저장한뒤 그중에서 짝수만 출력하기.
*/
#include<stdio.h>
void main() {
	int a[5];
	int i;
	int length = sizeof(a) / sizeof(int);

	//1. 입력
	for(i=0 ; i<length ; i++){
		printf("정수입력 :");
		scanf_s("%d",&a[i]);
		
	}

	for(i=0; i<length; i++){
		if(a[i]%2==0){   // if( !(a[i] % 2) ) {
			printf("a[%d]는 %d ",i,a[i]);
		}
	}
}
