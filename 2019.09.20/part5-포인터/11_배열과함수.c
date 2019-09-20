/*
길이가 10인 배열 --> 출력할 수 있게 함수에 전달
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