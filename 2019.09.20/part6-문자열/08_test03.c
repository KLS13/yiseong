/*
	����. ����� ���忡�� ������ �ܾ� ã��
		- ��ҹ��� ���� ��
	���� ��)
	�ܾ� �Է� >> korea
	�ش� �ܾ �ֽ��ϴ�.
	��Ʈ) ������ ã�Ƽ� \0 ���ڸ� �ִ� ���
*/
#include <stdio.h>
#include <string.h>

void main() {
	char str[] = "republic of korea";
	char word[100];
	int i;		// str�� �ε���
	int isExist = 0;	// 0, 1 (�������� �ʴ´�, �����Ѵ�)

	// 1. �Էº��� ����.
	fputs("�ܾ� �Է� >> ", stdout);
	scanf("%s", word);

	// 2. ������ ���ں��� ù ���ڱ��� ��ȸ
	for (i = strlen(str)-1; i >= 0; i--) {
		// 3. �� ���ھ� ������ �������� ��
		// �� ���� : str[i], ���� : ' ' => ���� �񱳿��� ���� ��(==)
		if (str[i] == ' ') {
			// 4. str[i] : ����
			//    str[i+1] : ���� �ܾ��� ù ����
			if ( !strcmp(word, &str[i+1]) ) {	// strcmp( &word[0], &str[i+1] )
				isExist = 1;	// �����Ѵ�.
				break;			// �׸� ã��!
			} else {
				// ���� �ڸ��� �� ���� ���� �����ϱ�
				str[i] = '\0';
			}
		}
	}

	// 5. �ݺ����� ����Ǹ� ù �ܾ ���� ������� ���´�.
	if ( !isExist ) {	// ���� �����ϴ� �ܾ �����ٴ� �ǹ�
		if ( !strcmp(word, str) ) {		// strcmp(&word[0], &str[0])
			isExist = 1;
		}
	}

	// 6. isExist Ȯ��
	if ( isExist ) {
		puts("�ش� �ܾ �ֽ��ϴ�.");
	} else {
		puts("�ش� �ܾ �����ϴ�.");
	}

}