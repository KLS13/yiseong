/*
	����. ����ڷκ��� 3���� id�� �Է� �޾�,
		MEMBER.txt ������ �����Ͻÿ�.
		�� id�� ������ �޸�(,)�� �����Ͻÿ�.
*/
#include <stdio.h>

void main() {
	FILE* out = fopen("MEMBER.txt", "w");
	char id[50];
	int n;
	int i;

	for (n = 0; n < 3; n++) {
		printf("id �Է� >> ");
		scanf("%s", id);		// id[0], id[1], id[2],,, id[i]
		i = 0;
		while (1) {
			if (id[i] == '\0') {
				break;
			}
			fputc(id[i++], out);
		}
		if (n != 2) {		// ������ ���̵� �ƴϸ�
			fputc(',', out);
		}
	}

	fclose(out);

}