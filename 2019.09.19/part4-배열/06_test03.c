/*
���̰� 5�� �迭 ����, ����ڷκ��� 5���� ������ �Է¹޾�
�ش� �迭�� �����ѵ� ���߿��� ¦���� ����ϱ�.
*/
#include<stdio.h>
void main() {
	int a[5];
	int i;
	int length = sizeof(a) / sizeof(int);

	//1. �Է�
	for(i=0 ; i<length ; i++){
		printf("�����Է� :");
		scanf_s("%d",&a[i]);
		
	}

	for(i=0; i<length; i++){
		if(a[i]%2==0){   // if( !(a[i] % 2) ) {
			printf("a[%d]�� %d ",i,a[i]);
		}
	}
}
