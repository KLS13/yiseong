/*
���̰� 10�� �迭 --> ����� �� �ְ� �Լ��� ����
*/
#include<stdio.h>
void output(int *ptr , int length){
	int i;
	for(i=0; i<length; i++) {
		printf("%d \n", ptr[i]);
	}
}
void main() {
	int a[5] = { 1, 2, 3, 4, 5 };
	output(a, sizeof(a)/sizeof(int));
}