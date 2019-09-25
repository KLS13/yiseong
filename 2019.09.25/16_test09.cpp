/*
	문제. 구조체 triangle 을 정의하시오
	멤버 변수(필드)   : width, height
	멤버 함수(메소드) : 입력 input, 출력 output, 넓이반환 getTriangleArea
	*/
#include<stdio.h>

struct triangle{
	int width;
	int height;

	void input(){
		printf("너비 입력 >> ");
		scanf_s("%d",&width);
		printf("높이 입력 >> ");
		scanf_s("%d",&height);
	}
	void output(){
		printf("너비는 :%d , 높이는 : %d \n", width,height);
		printf("넓이 : %g \n",getTriangleArea());
	}
	double getTriangleArea() {
		
		return width*height/2.0;
	}
};

void main() {
	triangle info;
	info.input();
	info.output();
	info.getTriangleArea();
}