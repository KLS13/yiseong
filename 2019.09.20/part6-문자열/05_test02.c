/*
	����. ���̵� �Է¹޾� ���̵��� �̻� ���� ���
	      - ���̵�� 5 ~ 20�� ���̸� ����
		  - "���� id�Դϴ�", "�߸��� id�Դϴ�"
*/
#include <stdio.h>
#include <string.h>

void main() {
	char id[21];

	fputs("���̵� �Է� >> ", stdout);
	// scanf("%s", id);
	fgets(id, sizeof(id), stdin);

	id[strlen(id)-1] = '\0';

	if ( strlen(id) >= 5 && strlen(id) <= 20 ) {
		puts("���� id�Դϴ�");
	} else {
		puts("�߸��� id�Դϴ�");
	}
}