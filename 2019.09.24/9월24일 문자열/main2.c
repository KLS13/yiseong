/*
	����. ������ ���� 3���� �����ϰ�,
	main �Լ��� �μ� ���� ������� ������ �ϳ� �����ؼ�,
	������ ������ ����� ���� �ִ��� ���� �Ǵ�
	"�ִ� ����", "���� ����"
*/
#include <stdio.h>
#include <string.h>

int main(int argc, char *argv[]) {

	char *subjects[3] = {"����", "����", "����"};
	int i;
	int isExist = 0;	// ã�� ������ ����!

	if (argc != 2) {
		printf("�߸��� �����Դϴ�. \n");
		return -1;
	}

	// ������Ʈ/> Part6-���ڿ�.exe ����

	for (i = 0; i < 3; i++) {
		if ( !strcmp(argv[1], subjects[i]) ) {
			isExist = 1;	// ã�� ������ �ִ�!
			break;			// �׸� ã��!
		}
	}

	if ( isExist ) {
		puts("�ִ� ����");
	} else {
		puts("���� ����");
	}

	return 0;
}