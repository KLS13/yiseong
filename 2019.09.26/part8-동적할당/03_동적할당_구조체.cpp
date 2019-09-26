#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct person {
	char gender;
	int age;
	double height;
	char name[20];
};
void main() {
	/*
	person woman;
	woman.age = 20;
	*/ 
	person* ptr;
	ptr = (person*)malloc(sizeof(person));

	ptr->gender = 'F';
	ptr->age = 20;
	ptr->height= 168.5;
	strcpy(ptr->name, "alice");

	printf("성별 : %c \n", ptr->gender);
	printf("나이 : %d \n", ptr->age);
	printf("키   : %lf\n", ptr->height);
	printf("성명 : %s \n", ptr->name);

	free(ptr);
}

