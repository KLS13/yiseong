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

	printf("���� : %c \n", ptr->gender);
	printf("���� : %d \n", ptr->age);
	printf("Ű   : %lf\n", ptr->height);
	printf("���� : %s \n", ptr->name);

	free(ptr);
}

