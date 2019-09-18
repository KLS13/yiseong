/*
정수 자료형
1) char : 문자 (Character)
2) int : 정수 (Integer)

실수 자료형
1) float : 실수 (단정밀도)
2) double : 실수 (배정밀도)

변수명 기본규칙
1) 영문, 숫자, 밑줄(_)을 혼합해서 사용한다.
2) 숫자로 시작을 못함.
3) 공백포함 불가
4) 대소문 구별 (int age, int AGE 다른 변수이다. )
5) 변수는 소문자, 상수는 대문자
*/

#include<stdio.h>
int main() {
	// 1. 변수의 선언
	// 자료형(type) 변수명;
	int age; //정수를 저장할 수 있는 age 변수를 사용
	char grade; // 문자를 저장할 수 있는 grade 변수를 사용하겠다
	float height;  //실수를 저장할 수 있는 height 변수를 사용
	double weight; // 실수를 저장할 수 있는 weight 변수
	char name[20] = "kim"; // 문자열

	age = 20;
	grade = 'A';
	height = 180.5f;
	weight = 80.5;
	
	/******** 확인 ********/

	printf("이름   : %s \n", name);
	printf("나이   : %d \n", age);
	printf("키     : %f \n", height);
	printf("몸무게 : %lf \n", weight);
	printf("등급   : %c \n", grade);

	return 0;
}

