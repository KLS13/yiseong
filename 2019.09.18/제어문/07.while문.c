/*
while문 : 반복횟수가 명확하지 않은 경우

while (조건식) {
}
*/

#include<stdio.h>
void main() {
	int n = 1;
	while(n<=5) {
		printf("%d \n", n);
		n++;
	}
}