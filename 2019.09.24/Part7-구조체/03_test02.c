/*
	문제. 정수 타입의 너비와 높이를 멤버로 가지는 triangle 구조체를 정의하고,
	사용자로부터 값을 입력 받아 너비, 높이, 크기를 출력하기
*/
#include <stdio.h>

// 1. 구조체 triangle 정의
struct triangle {
	int width;		// 너비
	int height;		// 높이
	double area;	// 크기
};

void main() {
	// 2. 구조체 triangle 변수 선언
	struct triangle semo;

	// 3. 입력
	printf("너비 >> ");	scanf_s("%d", &semo.width);
	printf("높이 >> ");	scanf_s("%d", &semo.height);

	// 4. 출력 및 계산
	semo.area = semo.width * semo.height / 2.0;
	printf("너비 : %d, 높이 : %d, 크기 : %g \n", semo.width, semo.height, semo.area);
}