/*
do~while�� : �ݺ� Ƚ���� ��Ȯ���� ���� ��쿡 ����
			 �ݵ�� 1ȸ �̻� ������ �ʿ��� ��쿡 ���

			 1. �������
			 do {
				�ݺ����๮;
				}while(���ǽ�); // �����ݷ� �ݵ�� �ʿ�
				*/

#include<stdio.h>
void main() {
	int num =1;

	do{
		printf("%d \n",num);
		num++;
	}while(num<=5);
}