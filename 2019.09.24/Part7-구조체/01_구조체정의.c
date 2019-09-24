/*
	구조체 (Struct)

	1. 서로 다른 자료형을 가지는 여러 변수를 하나의 자료형으로 묶어서
	   관리하기 위한 구조
	2. "구조체 정의" 후 "구조체 변수"를 선언해서 사용
	3. 구조체 정의 방법
		struct 구조체명 {
			멤버 변수 선언;
			...
		};
	4. 구조체 변수 선언 방법
		1) 자료형 : struct 구조체명
		2) 변수 선언
			struct 구조체명 변수명;
*/
#include <stdio.h>
#include <string.h>

// 1. 구조체 정의
struct person {
	char gender;	// 성별 (남, 여) X, (M, F) O
	int age;		// 나이
	double height;	// 키
	char name[30];	// 이름
};

void main() {
	// 2. 구조체 변수 선언
	// 구조체 자료형 : struct person
	// 구조체 변수명 : human
	struct person human;

	human.gender = 'F';
	human.age = 20;
	human.height = 168.5;
	strcpy(human.name, "alice");

	printf("성별 : %c \n", human.gender);
	printf("성별 : %s \n", human.gender == 'F' ? "여자" : "남자");
	printf("나이 : %d \n", human.age);
	printf("키 : %g \n", human.height);
	printf("이름 : %s \n", human.name);

}