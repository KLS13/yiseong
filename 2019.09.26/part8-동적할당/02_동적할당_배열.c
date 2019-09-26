/*
	1~100명의 기부 정보를 저장하려고 한다.
	정수 형태로 기부 정보를 저장한다고 가정하면,
	int a[100]; -> 최대 길이로 선언하고 사용했다.

	동적할당을 활용하면
	기부할때마다 공간 확보하면 끝!

	*/
#include <stdio.h>
#include <stdlib.h>

void main() {
	int* ptr;
	int length;
	int i;

	printf("원하는 배열의 길이를 입력 >> ");
	scanf_s("%d", &length);

	ptr = (int*)malloc(sizeof(int)*length);

	for(i=0 ; i<length; i++) {
		ptr[i] = (i+1) * 10;
		printf("%d \n", ptr[i]);
	}
	free(ptr);
}