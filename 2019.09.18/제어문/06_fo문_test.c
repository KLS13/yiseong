#include<stdio.h>
void main() {

	int dan;
	int i;
	int result;
	int num;
	printf("���ϴ� �� �Է� : ");
	scanf_s("%d", &dan);

	for( i=1 ; i<=9 ; i++) {
		result = dan*i;
		printf(" %d * %d = %d\n", dan,i,result);
	}
	printf("\n");
	printf("Ƚ�� �Է� : ");
	scanf_s("%d", &num);

	
	for( i = 1; i<=num; i++){
		printf("Hello World %dȸ\n",i);
	}
}
