/*
	1번째 입력 >> 2
	2번째 입력 >> 1
	3번째 입력 >> 3
	길이가 3인 배열
	배열요소 : 2 1 3 출력
*/
#include<stdio.h>
	void input(int ptr[], int length){
	int i;
	for(i=0; i<length; i++) {
	printf("정수 입력 : ");
	scanf_s("%d",&ptr[i]);
	}
}
	
void output(int *ptr , int length){
	int i;
	for(i=0; i<length; i++) {
		printf("%d\t", ptr[i]);
	}
}

void main() {

	int a[3];
	input(a,sizeof(a)/sizeof(int));
	output(a,sizeof(a)/sizeof(int));
	
	
}
