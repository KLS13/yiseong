/*
 �迭 ����
 ���� �� �迭�� ���̴� �ݵ�� "���"�� �����ؾ� �Ѵ�.
 ���߿� �迭�� ���̸� ������ �� ����.
 int length = 10;
 int a[length]; //�̷��� ����Ұ�
 �迭�� ���̸� ���ϴ� ����
 int a[3];
 sizeof(int) : 4 (int �� ũ��)
 sizeof(a)   : 12(�迭 a�� ũ��)
 ��,  sizeof(a) / sizeof(int) : 3 ( �迭�� ���� )
    
 */

#include<stdio.h>

void main() {
	int a[3] = {1, 2, 3};
	int i;
	int length = sizeof(a) / sizeof(int);

	for( i=0 ; i<length; i++){
		printf("%d ",a[i]);
	}
}