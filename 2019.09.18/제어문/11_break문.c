/*
 break�� 
 1. ���ѷ��� + break ���·� ���� ���ȴ�.

 2. ���� ���� ����
	2) for ( ; ; )
	3) while(1) -> �ڹٿ����� while(true)

	*/

#include<stdio.h>

void main() {
	int n, total;
	int num, sum;

	n=1;
	total=0;
	num=1;
	sum=0;

	while(1) {
		total = total + n;
		printf("0���� %d���� ���� %d �̴� \n", n,total);

		if(total>=100){
			break;
		}
		n++;
	}

	printf("==================================");
	
	while(sum<100){
		sum += num;
		printf("0���� %d���� ���� %d �̴� \n", num,sum);
		num++;
	}

}