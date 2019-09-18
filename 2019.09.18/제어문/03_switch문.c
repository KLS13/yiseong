/*
switch문
1. 사용 형식
switch(표현식) {
case 값1 : 
	실행문;
	break;
case 값2 : 
	실행문;
	break;
default :
	실행문;
	}
	*/

#include<stdio.h>
#define	CREATE 1
#define READ 2
#define UPDATE 3
#define DELETE 4
void main() {
	int choice;
	printf("1: C, 2: R, 3: U, 4: D \n");
	printf("작업 선택 : ");
	scanf_s("%d", &choice);
	switch (choice) {
	case CREATE :
		printf("삽입 \n");
		break;
	case READ :
		printf("검색 \n");
		break;
	case UPDATE :
		printf("수정 \n");
		break;
	case DELETE :
		printf("삭제 \n");
		break;
	default :
		printf("없는 명령임 \n");
	}
}