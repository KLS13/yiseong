#include<stdio.h>

struct person {
	// ��� ���� = �ʵ�
	char gender;
	int age;
	double height;
	char name[20];
	// ��� �Լ� = �޼ҵ�
	void output() {
		printf("���� : %c \n", gender);
		printf("���� : %d�� \n", age);
		printf("���� : %gcm \n",height);
		printf("���� : %s \n", name);
	}
};
void main() {
	person woman = {'F', 20, 168.5, "alice"};
	woman.output();
}


