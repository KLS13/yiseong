/*
	���浿�� ���� �Է�
	   ���� >> xx
	   ���� >> xx
	   ���� >> xx
	���浿�� ���� �Է�
	   ���� >> xx
	   ���� >> xx
	   ���� >> xx
	�ٱ浿�� ���� �Է�
	   ���� >> xx
	   ���� >> xx
	   ���� >> xx

			����		����		����
	���浿	xx		xx		xx
	���浿	xx		xx		xx
	�ٱ浿	xx		xx		xx
*/
#include <stdio.h>

void main() {
	int scores[4][4] = {0};	// ��� ��Ҹ� 0���� �ʱ�ȭ
	char *subjects[4] = {"����", "����", "����", "����"};
	char *names[4] = {"���浿", "���浿", "�ٱ浿", "�հ�"};
	int i, j;

	// 1. �Է�
	for (i = 0; i < 3; i++) {		// i : �̸���ȣ
		printf("%s�� ���� �Է�\n", names[i]);
		for (j = 0; j < 3; j++) {	// j : �����ȣ
			printf("  %s >> ", subjects[j]);
			scanf_s("%d", &scores[i][j]);
			scores[i][3] += scores[i][j];	// �л����� += ����������
			scores[3][j] += scores[i][j];	// �����հ� += ����������
			scores[3][3] += scores[i][j];	// ��ü���� += ����������
		}
	}

	// 2. ���
	printf("\t");
	for (i = 0; i < 4; i++) {
		printf("%s\t", subjects[i]);
	}
	printf("\n");

	for (i = 0; i < 4; i++) {
		printf("%s\t", names[i]);
		for (j = 0; j < 4; j++) {
			printf("%d\t", scores[i][j]);
		}
		printf("\n");
	}

}