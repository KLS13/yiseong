/*
	1. ����ü book
	 - ����,����,����
	2. ����ü staff
	 - �̸�,����,�ٹ����
	3. ����ü library
	 - book 2�� , staff 2��
	 libray ����� ����ϱ�
	 �� ����� ���� ������ �ʱ�ȭ
	*/
#include<stdio.h>
#include<string.h>
struct book {
	char title[20];
	char writer[20];
	int price;
};

struct staff {
	char name[20];
	char job[20];
	int year;
};

struct library {
	book myBook[2];
	staff myStaff[2]; 
};

void main(){
	int i;
	library sinchon;
	sinchon.myBook[0].price = 30000;
	strcpy(sinchon.myBook[0].title, "�ڹ� ���α׷���");
	strcpy(sinchon.myBook[0].writer, "jamse java");

	sinchon.myBook[1].price = 35000;
	strcpy(sinchon.myBook[1].title, "JSP ���α׷���");
	strcpy(sinchon.myBook[1].writer, "alice jsp");

	strcpy(sinchon.myStaff[0].job, "�ȳ�");
	strcpy(sinchon.myStaff[0].name, "����");
	sinchon.myStaff[0].year = 3;

	strcpy(sinchon.myStaff[1].job, "û��");
	strcpy(sinchon.myStaff[1].name, "�߻��");
	sinchon.myStaff[1].year = 10;

	for(i=0; i<2 ; i++){
		printf("å ���� : %s, ���� : %s, ����: %d \n",sinchon.myBook[i].title,sinchon.myBook[i].writer,sinchon.myBook[i].price);
		
}
	for(i=0; i<2; i++){
		printf("���� �̸� : %s, ���� : %s , �ٹ���� : %d \n", sinchon.myStaff[i].name,sinchon.myStaff[i].job,sinchon.myStaff[i].year);
	}
}