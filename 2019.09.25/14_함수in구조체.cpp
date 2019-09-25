#include<stdio.h>

struct person {
	// 멤버 변수 = 필드
	char gender;
	int age;
	double height;
	char name[20];
	// 멤버 함수 = 메소드
	void output() {
		printf("성별 : %c \n", gender);
		printf("나이 : %d살 \n", age);
		printf("신장 : %gcm \n",height);
		printf("성명 : %s \n", name);
	}
};
void main() {
	person woman = {'F', 20, 168.5, "alice"};
	woman.output();
}


