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

	//���
	printf("���� : %d�� \n", woman.age);
	printf("�̸� : %s \n", woman.name);
	printf("���� : %d�� \n",woman.w->money);
	printf("ī�� : %s \n",woman.w->card);
}