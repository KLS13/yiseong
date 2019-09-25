/*
구조체 book 을 정의
 - 멤버 변수(필드)  : title , writer, price
 - 멤버 함수(메소드): 입력(input), 출력(output)

*/

#include<stdio.h>
#include<string.h>
struct book {
	int price;
	char title[20];
	char writer[20];
	
	void input(){
		printf("제목 입력 >> ");
		gets(title);
		printf("저자 입력 >> ");
		gets(writer);
		printf("가격 입력 >> ");
		scanf_s("%d",&price);
	}
	void ouput(){
		printf("제목 : %s",title);
		printf("저자 : %s",writer);
		printf("가격 : %d \n",price);
	}
};
void main(){
	book myBook;
	myBook.input();
	myBook.ouput();
}
