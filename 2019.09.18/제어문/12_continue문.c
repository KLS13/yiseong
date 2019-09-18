#include<stdio.h>

void main() {
	int num;

	for(num=1; num<=20; num++) {
		if(num % 2 == 0){
			continue;
		}
		printf("%d \n", num);
	}
}