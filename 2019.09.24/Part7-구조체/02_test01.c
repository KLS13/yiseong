/*
	문제. 다음과 같은 구조체를 정의하세요.
		- 구조체명 : book
		- 멤버 변수 : title, writer, pages, price
		사용자로부터 모든 멤버 값을 입력 받아 저장 후 출력하기
*/
#include <stdio.h>
#include <string.h>

// 1. 구조체 book 정의하기
struct book {
	int pages;
	int price;
	char title[50];
	char writer[50];
};

void main() {
	// 2. 구조체 book 변수 선언하기
	struct book myBook;

	// 3. 입력
	printf("책 제목 >> ");
	gets(myBook.title);	// 엔터까지 입력으로 받는다. 엔터를 저장하지는 않는다.

	printf("책 저자 >> ");
	fgets(myBook.writer, sizeof(myBook.writer), stdin);
	// 엔터까지 입력으로 받는다. 엔터를 저장한다.

	// 저자 마지막에 삽입된 엔터 제거
	myBook.writer[strlen(myBook.writer) - 1] = '\0';

	printf("책 페이지 수 >> ");
	scanf_s("%d", &myBook.pages);

	printf("책 가격 >> ");
	scanf_s("%d", &myBook.price);

	// 4. 출력
	printf("책 제목 : %s \n", myBook.title);
	printf("책 저자 : %s \n", myBook.writer);
	printf("책 페이지 수 : %d \n", myBook.pages);
	printf("책 가격 : %d \n", myBook.price);
}