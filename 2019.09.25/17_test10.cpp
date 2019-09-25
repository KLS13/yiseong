/*
	문제. 구조체 wallet 을 정의하시오.
			- 멤버 변수(필드)	: money, card
			- 멤버 함수(메소드)	: 출력 output
		  구조체 person 을 정의하시오.
			- 멤버 변수(필드)	: gender, age, height, name, w
			- 멤버 함수(메소드)	: 입력 input, 출력 output
*/
#include <stdio.h>

struct wallet {
	// 필드
	int money;
	char card[20];

	// 메소드
	void output() {
		printf("지갑 현금 : %d원\n", money);
		printf("지갑 카드 : %s카드\n", card);
	}
};

struct person {
	// 필드
	char gender;
	int age;
	double height;
	char name[20];
	wallet w;

	// 메소드
	void input() {
		printf("성별 >> ");	scanf_s("%c", &gender);
		printf("나이 >> ");	scanf_s("%d", &age);
		printf("신장 >> ");	scanf_s("%lf", &height);
		fflush(stdin);
		printf("성명 >> ");	gets(name);
	}
	void output() {
		printf("성별 : %c \n", gender);
		printf("나이 : %d살 \n", age);
		printf("신장 : %gcm \n", height);
		printf("성명 : %s \n", name);
		w.output();
	}
	void setWallet(wallet _w) {
		w = _w;
	}
};

void main() {
	wallet gucci = {50000, "삼성"};
	person woman;
	woman.input();
	woman.setWallet(gucci);
	woman.output();
}