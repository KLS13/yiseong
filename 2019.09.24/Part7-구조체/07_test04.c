/*
	����. ����ü student �� �����Ͻÿ�.
		- ��� : name, scores[4](0~2:��������, 3:����)
		  student �� 3�� �����ϴ� �迭�� �̿��� �Է°� ��� �����ϱ�
*/
#include <stdio.h>

struct student {
	char name[21];
	int scores[4];
};

void main() {
	struct student a[3];
	int i, j;

	for (i = 0; i < 3; i++) {
		// �Է� ���� ���� (�����츸 ����)
		fflush(stdin);

		// �Է� ���� ���� (���н�, ������, Mac)
		// while (getchar() != '\n');	// �ݺ����๮�� ���� while��

		printf("�̸� �Է� >> ");
		gets(a[i].name);
		
		a[i].scores[3] = 0;
		for (j = 0; j < 3; j++) {
			printf("����%d >> ", j + 1);
			scanf_s("%d", &a[i].scores[j]);
			a[i].scores[3] += a[i].scores[j];
		}
	}

	for (i = 0; i < 3; i++) {
		printf("%s\t", a[i].name);
		for (j = 0; j < 4; j++) {
			printf("%d\t", a[i].scores[j]);
		}
		printf("\n");
	}

}