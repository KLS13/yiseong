/*
	���� ��)
	�̸� �Է� >> tom cruise
	���� �Է� >> 50
	Ű �Է� >> 170.5
	�ּ� �Է� >> LA, america
	�̸� : tom cruise
	���� : 50
	Ű : 170.5
	�ּ� : LA, america
*/
#include <stdio.h>

void main() {
	char name[100];
	int age;		// char age[100]; ��� �� ��!
	double height;	// char height[100];
	char address[100];

	fputs("�̸� �Է� >> ", stdout);
	fgets(name, sizeof(name), stdin);	// gets(name);

	fputs("���� �Է� >> ", stdout);
	scanf_s("%d", &age);

	fputs(" Ű �Է� >> ", stdout);
	scanf_s("%lf", &height);

	fflush(stdin);	// �Է� ���� ���� (������ ����)

	fputs("�ּ� �Է� >> ", stdout);
	fgets(address, sizeof(address), stdin);		// gets(address);

	printf("�̸� : %s \n", name);
	printf("���� : %d \n", age);
	printf("Ű : %g \n", height);
	printf("�ּ� : %s \n", address);
}