//����ó ���� ���α׷�
/*
# 1. �� ����ó ���� ���
# 2. ���� ����ó ���� ���
# 3. ���� ����ó ���� ���
# 4. ���� ����ó �˻� ���
# 5. ��ü ����ó �˻� ���
# 6. ��ü ����ó ���� ���� ��� 
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/*
#define INSERT 1
#define DELETE 2
#define SEARCH 3
#define PRINT 4
#define EXIT 5
*/
enum { INSERT=1, DELETE=2, SEARCH=3, PRINT=4, EXIT=5 };

struct Contact {
	char name[20];
	char tel[20];
};

void menu() {
	printf("*****MENU*****\n");
	printf("* 1. INSERT  *\n");
	printf("* 2. DELETE  *\n");
	printf("* 3. SEARCH  *\n");
	printf("* 4. PRINT   *\n");
	printf("* 5. EXIT    *\n");
	printf("**************\n");
}

void insert(Contact* b[], int* idx) {
	//  idx == main�� &idx
	// *idx == main�� idx ��
	
	// b �迭�� ��� ������ �ε��� ���� : 0 ~ 99
	// �迭�� ���� á���� �˻�
	if (*idx == 100) {
		printf("����ó ���� ������ �����մϴ�.\n");
		return;
	}

	printf("[INSERT]\n");

	// 1. Contact�� ���� ���� ���� �Ҵ�
	b[*idx] = (Contact*)malloc(sizeof(Contact));

	// 2. ������ ������ ���� �Է�
	printf("�� ����ó ���� >> ");	gets(b[*idx]->name);
	printf("��ȭ��ȣ >> ");			gets(b[*idx]->tel);

	// 3. �ε��� ����
	(*idx)++;

	printf("[END INSERT]\n");
}

void print(Contact* b[], int* idx) {
	int i;

	// �迭�� ��� �ִ��� �˻�
	if (*idx == 0) {
		printf("����� ����ó�� �����ϴ�.\n");
		return;
	}

	printf("[PRINT]\n");

	for (i = 0; i < *idx; i++) {
		printf("%d. %s, %s\n", i + 1, b[i]->name, b[i]->tel);
	}

	printf("[END PRINT]\n");
}

void search(Contact* b[], int* idx) {
	int i;
	char findName[20];
	int isExist = 0;	// ã�� �̸��� ����!

	// �迭�� ��� �ִ��� �˻�
	if (*idx == 0) {
		printf("����� ����ó�� �����ϴ�.\n");
		return;
	}

	printf("[SEARCH]\n");

	printf("ã�� ���� �Է� >> ");	gets(findName);

	for (i = 0; i < *idx; i++) {
		if (strcmp(findName, b[i]->name) == 0) {
			printf("%d. %s, %s\n", i + 1, b[i]->name, b[i]->tel);
			isExist = 1;	// ã�� �̸��� �ִ�!
		}
	}

	if ( !isExist ) {	// if (isExist == 0) {
		printf("%s ����ó�� �����ϴ�.\n", findName);
	}

	printf("[END SEARCH]\n");
}

void remove(Contact* b[], int* idx) {
	int i, j;
	char deleteName[20];
	int isExist = 0;	// ������ �̸��� ����!

	// �迭�� ��� �ִ��� �˻�
	if (*idx == 0) {
		printf("����� ����ó�� �����ϴ�.\n");
		return;
	}

	printf("[DELETE]\n");

	printf("������ ���� �Է� >> ");	gets(deleteName);

	for (i = 0; i < *idx; i++) {
		if (strcmp(deleteName, b[i]->name) == 0) {
			free(b[i]);		// ���� ����ó�� ����
			for (j = i; j < *idx - 1; j++) {
				b[j] = b[j + 1];
			}
			isExist = 1;	// ������ �̸��� �ִ�!
			(*idx)--;		// �ε��� ����
		}
	}

	if ( !isExist ) {	// if (isExist == 0) {
		printf("%s ����ó�� �����ϴ�.\n", deleteName);
	} else {
		printf("%s ����ó�� �����Ǿ����ϴ�.\n", deleteName);
	}

	printf("[END DELETE]\n");
}

void exit(Contact* b[], int* idx) {
	FILE* out;
	int i;

	// �迭�� ��� �ִ��� �˻�
	if (*idx == 0) {
		printf("����� ����ó�� �����ϴ�.\n");
		return;
	}

	out = fopen("CONTACT.dat", "wb");
	if (out == NULL) {
		printf("���� ���� ����!\n");
		return;
	}

	for (i = 0; i < *idx; i++) {
		// �ּ�, ũ��, ����, ����������
		fwrite(b[i], sizeof(Contact), 1, out);
		free(b[i]);
	}

	printf("CONTACT.dat ������ �����Ǿ����ϴ�.\n");
	fclose(out);
}

int start(Contact* b[]) {
	FILE* in = fopen("CONTACT.dat", "rb");
	Contact temp;	// CONTACT.dat ���Ͽ��� �о���� ����ó 1�� �ӽ�����
	int idx = 0;
	int readCount = 0;

	if (in == NULL) {
		printf("CONTACT.dat ������ �����ϴ�.\n");
	} else {
		while (1) {
			// fread �� ���� : �о� ���� ���� �������� ����
			// fread(�ּ�, ũ��, ����, ����������)
			readCount = fread(&temp, sizeof(Contact), 1, in);
			if (readCount < 1) {
				break;	// ���ѷ��� ����
			} else {
				b[idx] = (Contact*)malloc(sizeof(Contact));
				*b[idx] = temp;
				idx++;
			}
		}
		printf("CONTACT.dat ������ �о����ϴ�.\n");
		fclose(in);
	}
	return idx;
}

int main() {

	Contact* b[100];
	int idx;
	int choice;

	idx = start(b);

	while (1) {
		menu();
		printf("���� >> ");	scanf_s("%d", &choice);	getchar();
		switch (choice) {
		case INSERT: insert(b, &idx);	break;		// case 1:
		case DELETE: remove(b, &idx);	break;		// case 2:
		case SEARCH: search(b, &idx);	break;		// case 3:
		case PRINT: print(b, &idx);		break;		// case 4:
		case EXIT: exit(b, &idx);		return 0;	// case 5:
		default: printf("���� ����Դϴ�. �ٽ� �Է��ϼ���. \n");
		}
	}

}