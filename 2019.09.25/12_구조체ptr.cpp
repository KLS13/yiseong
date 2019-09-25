#include<stdio.h>

struct wallet {
	int money;
	char card[20];
};

struct person {
	int age;
	char name[20];
	wallet* w;
};

void main() {
	wallet gucci = {50000, "samsung"};
	person woman = {20,"alice",&gucci};

	//출력
	printf("나이 : %d살 \n", woman.age);
	printf("이름 : %s \n", woman.name);
	printf("현금 : %d원 \n",woman.w->money);
	printf("카드 : %s \n",woman.w->card);
}