/*
switch��
1. ��� ����
switch(ǥ����) {
case ��1 : 
	���๮;
	break;
case ��2 : 
	���๮;
	break;
default :
	���๮;
	}
	*/

#include<stdio.h>
#define	CREATE 1
#define READ 2
#define UPDATE 3
#define DELETE 4
void main() {
	int choice;
	printf("1: C, 2: R, 3: U, 4: D \n");
	printf("�۾� ���� : ");
	scanf_s("%d", &choice);
	switch (choice) {
	case CREATE :
		printf("���� \n");
		break;
	case READ :
		printf("�˻� \n");
		break;
	case UPDATE :
		printf("���� \n");
		break;
	case DELETE :
		printf("���� \n");
		break;
	default :
		printf("���� ����� \n");
	}
}