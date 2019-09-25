/*
	1. 구조체 book
	 - 제목,저자,가격
	2. 구조체 staff
	 - 이름,업무,근무년수
	3. 구조체 library
	 - book 2권 , staff 2명
	 libray 만들어 출력하기
	 각 멤버는 임의 값으로 초기화
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
	strcpy(sinchon.myBook[0].title, "자바 프로그래밍");
	strcpy(sinchon.myBook[0].writer, "jamse java");

	sinchon.myBook[1].price = 35000;
	strcpy(sinchon.myBook[1].title, "JSP 프로그래밍");
	strcpy(sinchon.myBook[1].writer, "alice jsp");

	strcpy(sinchon.myStaff[0].job, "안내");
	strcpy(sinchon.myStaff[0].name, "김사랑");
	sinchon.myStaff[0].year = 3;

	strcpy(sinchon.myStaff[1].job, "청소");
	strcpy(sinchon.myStaff[1].name, "추사랑");
	sinchon.myStaff[1].year = 10;

	for(i=0; i<2 ; i++){
		printf("책 제목 : %s, 저자 : %s, 가격: %d \n",sinchon.myBook[i].title,sinchon.myBook[i].writer,sinchon.myBook[i].price);
		
}
	for(i=0; i<2; i++){
		printf("직원 이름 : %s, 업무 : %s , 근무년수 : %d \n", sinchon.myStaff[i].name,sinchon.myStaff[i].job,sinchon.myStaff[i].year);
	}
}