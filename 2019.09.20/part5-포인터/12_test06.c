/*
	1��° �Է� >> 2
	2��° �Է� >> 1
	3��° �Է� >> 3
	���̰� 3�� �迭
	�迭��� : 2 1 3 ���
*/
#include<stdio.h>
	void input(int ptr[], int length){
	int i;
	for(i=0; i<length; i++) {
	printf("���� �Է� : ");
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
