#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct person {
	char gender;
	int age;
	double height;
	char name[20];
};

void main() {
	person* ptr[5];
	int count;
	int i;
	// ����ڷκ��� �� ���� ������ �Է� ���� ������ �Է� �޾�,
	// �ش� �� ��ŭ�� person ������ �����ϰ� �Է� �޾� ����ϱ�
	printf("�� ���� �Է¹�������? >> ");
	scanf_s("%d", &count);

	for (i = 0; i < count; i++) {
		ptr[i] = (person*)malloc(sizeof(person));
		printf("�̸� >> ");	scanf("%s", ptr[i]->name);
		printf("���� >> ");	scanf_s(" %c", &ptr[i]->gender);
		printf("���� >> ");	scanf_s("%d", &ptr[i]->age);
		printf("���� >> ");	scanf_s("%lf", &ptr[i]->height);
	}
	printf("=======================================\n");

	for (i = 0; i < count; i++) {
		printf("���� : %c \n", ptr[i]->gender);
		printf("���� : %d \n", ptr[i]->age);
		printf("���� : %g \n", ptr[i]->height);
		printf("���� : %s \n", ptr[i]->name);
		printf("=======================================\n");
	}

	for (i = 0; i < count; i++) {
		free(ptr[i]);
	}

}