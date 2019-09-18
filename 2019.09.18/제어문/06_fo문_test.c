#include<stdio.h>
void main() {

	int dan;
	int i;
	int result;
	int num;
	printf("원하는 단 입력 : ");
	scanf_s("%d", &dan);

	for( i=1 ; i<=9 ; i++) {
		result = dan*i;
		printf(" %d * %d = %d\n", dan,i,result);
	}
	printf("\n");
	printf("횟수 입력 : ");
	scanf_s("%d", &num);

	
	for( i = 1; i<=num; i++){
		printf("Hello World %d회\n",i);
	}
}
