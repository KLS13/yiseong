// 변수 n을 선언하고  사용자로부터 n에 값을 입력받아 출력하기

#include<stdio.h>
void main() {
	int n;
	int *ptr = &n;

	printf("정수입력 : ");
	scanf_s("%d", ptr);  // 	scanf_s("%d", &n); 과 똑같음.

	printf(" 결과값 : %d \n", *ptr);  //*ptr == n
}