/*
	#include <string.h>

	strcpy(dest, src);
	src -> dest ���� ����
*/
#include <stdio.h>
#include <string.h>

void main() {
	int age;
	double height;
	char name[100];

	age = 20;
	height = 180.5;
	strcpy(name, "james");	// name = "james";

	printf("�̸� : %s \n", name);
}