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
	// ptr == &n;   n의 주소
	// *ptr == n ;  변수 n
	person woman = {'F',20,168.5,"alice"};
	person *ptr = &woman;
	// ptr == &woman
	// *ptr == woman
	// *ptr.gender (x) ---> (*ptr).gender == woman.gender

	printf("성별 : %c \n",(*ptr).gender);
	printf("나이 : %d \n",(*ptr).age);
	printf("신장 : %g \n",(*ptr).height);
	printf("이름 : %s \n",(*ptr).name);

	printf("성별 : %c \n",ptr->gender);
	printf("나이 : %d \n",ptr->age);
	printf("신장 : %g \n",ptr->height);
	printf("이름 : %s \n",ptr->name);
}