/*
	����. ������ ���� ����ü�� �����ϼ���.
		- ����ü�� : book
		- ��� ���� : title, writer, pages, price
		����ڷκ��� ��� ��� ���� �Է� �޾� ���� �� ����ϱ�
*/
#include <stdio.h>
#include <string.h>

// 1. ����ü book �����ϱ�
struct book {
	int pages;
	int price;
	char title[50];
	char writer[50];
};

void main() {
	// 2. ����ü book ���� �����ϱ�
	struct book myBook;

	// 3. �Է�
	printf("å ���� >> ");
	gets(myBook.title);	// ���ͱ��� �Է����� �޴´�. ���͸� ���������� �ʴ´�.

	printf("å ���� >> ");
	fgets(myBook.writer, sizeof(myBook.writer), stdin);
	// ���ͱ��� �Է����� �޴´�. ���͸� �����Ѵ�.

	// ���� �������� ���Ե� ���� ����
	myBook.writer[strlen(myBook.writer) - 1] = '\0';

	printf("å ������ �� >> ");
	scanf_s("%d", &myBook.pages);

	printf("å ���� >> ");
	scanf_s("%d", &myBook.price);

	// 4. ���
	printf("å ���� : %s \n", myBook.title);
	printf("å ���� : %s \n", myBook.writer);
	printf("å ������ �� : %d \n", myBook.pages);
	printf("å ���� : %d \n", myBook.price);
}