/*
	����. ����ü wallet �� �����Ͻÿ�.
			- ��� ����(�ʵ�)	: money, card
			- ��� �Լ�(�޼ҵ�)	: ��� output
		  ����ü person �� �����Ͻÿ�.
			- ��� ����(�ʵ�)	: gender, age, height, name, w
			- ��� �Լ�(�޼ҵ�)	: �Է� input, ��� output
*/
#include <stdio.h>

struct wallet {
	// �ʵ�
	int money;
	char card[20];

	// �޼ҵ�
	void output() {
		printf("���� ���� : %d��\n", money);
		printf("���� ī�� : %sī��\n", card);
	}
};

struct person {
	// �ʵ�
	char gender;
	int age;
	double height;
	char name[20];
	wallet w;

	// �޼ҵ�
	void input() {
		printf("���� >> ");	scanf_s("%c", &gender);
		printf("���� >> ");	scanf_s("%d", &age);
		printf("���� >> ");	scanf_s("%lf", &height);
		fflush(stdin);
		printf("���� >> ");	gets(name);
	}
	void output() {
		printf("���� : %c \n", gender);
		printf("���� : %d�� \n", age);
		printf("���� : %gcm \n", height);
		printf("���� : %s \n", name);
		w.output();
	}
	void setWallet(wallet _w) {
		w = _w;
	}
};

void main() {
	wallet gucci = {50000, "�Ｚ"};
	person woman;
	woman.input();
	woman.setWallet(gucci);
	woman.output();
}