/*
����ü book �� ����
 - ��� ����(�ʵ�)  : title , writer, price
 - ��� �Լ�(�޼ҵ�): �Է�(input), ���(output)

*/

#include<stdio.h>
#include<string.h>
struct book {
	int price;
	char title[20];
	char writer[20];
	
	void input(){
		printf("���� �Է� >> ");
		gets(title);
		printf("���� �Է� >> ");
		gets(writer);
		printf("���� �Է� >> ");
		scanf_s("%d",&price);
	}
	void ouput(){
		printf("���� : %s",title);
		printf("���� : %s",writer);
		printf("���� : %d \n",price);
	}
};
void main(){
	book myBook;
	myBook.input();
	myBook.ouput();
}
