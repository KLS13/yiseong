#include<stdio.h>

struct person {
	char gender;
	int age;
	double height;
	char name[20];
};

void main() {

	//int n = 10;
	//int *ptr = &n;
	// ptr == &n;   n�� �ּ�
	// *ptr == n ;  ���� n
	person woman = {'F',20,168.5,"alice"};
	person *ptr = &woman;
	// ptr == &woman
	// *ptr == woman
	// *ptr.gender (x) ---> (*ptr).gender == woman.gender

	printf("���� : %c \n",(*ptr).gender);
	printf("���� : %d \n",(*ptr).age);
	printf("���� : %g \n",(*ptr).height);
	printf("�̸� : %s \n",(*ptr).name);

	printf("���� : %c \n",ptr->gender);
	printf("���� : %d \n",ptr->age);
	printf("���� : %g \n",ptr->height);
	printf("�̸� : %s \n",ptr->name);
}