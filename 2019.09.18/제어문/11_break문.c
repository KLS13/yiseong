/*
 break문 
 1. 무한루프 + break 형태로 자주 사용된다.

 2. 무한 루프 형태
	2) for ( ; ; )
	3) while(1) -> 자바에서는 while(true)

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
		printf("0부터 %d까지 합은 %d 이다 \n", n,total);

		if(total>=100){
			break;
		}
		n++;
	}

	printf("==================================");
	
	while(sum<100){
		sum += num;
		printf("0부터 %d까지 합은 %d 이다 \n", num,sum);
		num++;
	}

}