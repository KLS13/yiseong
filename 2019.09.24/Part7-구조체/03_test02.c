/*
	����. ���� Ÿ���� �ʺ�� ���̸� ����� ������ triangle ����ü�� �����ϰ�,
	����ڷκ��� ���� �Է� �޾� �ʺ�, ����, ũ�⸦ ����ϱ�
*/
#include <stdio.h>

// 1. ����ü triangle ����
struct triangle {
	int width;		// �ʺ�
	int height;		// ����
	double area;	// ũ��
};

void main() {
	// 2. ����ü triangle ���� ����
	struct triangle semo;

	// 3. �Է�
	printf("�ʺ� >> ");	scanf_s("%d", &semo.width);
	printf("���� >> ");	scanf_s("%d", &semo.height);

	// 4. ��� �� ���
	semo.area = semo.width * semo.height / 2.0;
	printf("�ʺ� : %d, ���� : %d, ũ�� : %g \n", semo.width, semo.height, semo.area);
}