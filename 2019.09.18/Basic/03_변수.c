/*
���� �ڷ���
1) char : ���� (Character)
2) int : ���� (Integer)

�Ǽ� �ڷ���
1) float : �Ǽ� (�����е�)
2) double : �Ǽ� (�����е�)

������ �⺻��Ģ
1) ����, ����, ����(_)�� ȥ���ؼ� ����Ѵ�.
2) ���ڷ� ������ ����.
3) �������� �Ұ�
4) ��ҹ� ���� (int age, int AGE �ٸ� �����̴�. )
5) ������ �ҹ���, ����� �빮��
*/

#include<stdio.h>
int main() {
	// 1. ������ ����
	// �ڷ���(type) ������;
	int age; //������ ������ �� �ִ� age ������ ���
	char grade; // ���ڸ� ������ �� �ִ� grade ������ ����ϰڴ�
	float height;  //�Ǽ��� ������ �� �ִ� height ������ ���
	double weight; // �Ǽ��� ������ �� �ִ� weight ����
	char name[20] = "kim"; // ���ڿ�

	age = 20;
	grade = 'A';
	height = 180.5f;
	weight = 80.5;
	
	/******** Ȯ�� ********/

	printf("�̸�   : %s \n", name);
	printf("����   : %d \n", age);
	printf("Ű     : %f \n", height);
	printf("������ : %lf \n", weight);
	printf("���   : %c \n", grade);

	return 0;
}

