/*
if�� : ���ǽĿ� ���� �б⹮
	1. �������
	if(���ǽ�) {
	���๮;
	} else if(���ǽ�) {
	���๮;
	}else{
	���๮;
	}
	*/

#include <stdio.h>
void main() {
	int num;
	printf("�����Է� : ");
	scanf_s("%d", &num);
	if( num>0 ) {
		printf("��� \n");
	}else if(num==0) {
		printf("0 �� \n");
	}else{
		printf("���� \n");
	}
}

