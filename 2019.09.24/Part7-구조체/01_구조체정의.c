/*
	����ü (Struct)

	1. ���� �ٸ� �ڷ����� ������ ���� ������ �ϳ��� �ڷ������� ���
	   �����ϱ� ���� ����
	2. "����ü ����" �� "����ü ����"�� �����ؼ� ���
	3. ����ü ���� ���
		struct ����ü�� {
			��� ���� ����;
			...
		};
	4. ����ü ���� ���� ���
		1) �ڷ��� : struct ����ü��
		2) ���� ����
			struct ����ü�� ������;
*/
#include <stdio.h>
#include <string.h>

// 1. ����ü ����
struct person {
	char gender;	// ���� (��, ��) X, (M, F) O
	int age;		// ����
	double height;	// Ű
	char name[30];	// �̸�
};

void main() {
	// 2. ����ü ���� ����
	// ����ü �ڷ��� : struct person
	// ����ü ������ : human
	struct person human;

	human.gender = 'F';
	human.age = 20;
	human.height = 168.5;
	strcpy(human.name, "alice");

	printf("���� : %c \n", human.gender);
	printf("���� : %s \n", human.gender == 'F' ? "����" : "����");
	printf("���� : %d \n", human.age);
	printf("Ű : %g \n", human.height);
	printf("�̸� : %s \n", human.name);

}