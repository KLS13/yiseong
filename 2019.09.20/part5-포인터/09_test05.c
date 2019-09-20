/*정수 입력 >> 3
입력받은 정수는 3이다 */

#include<stdio.h>

void input(int *ptr){
	printf("정수 입력 : ");
	scanf_s("%d",ptr);
}
void print(int *ptr){
	printf("입력받은 정수는 %d 이다 \n", *ptr);
}


void main() {
	int n;
	input(&n);
	print(&n);
}