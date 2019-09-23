/*
	실행 예)
	이름 입력 >> tom cruise
	나이 입력 >> 50
	키 입력 >> 170.5
	주소 입력 >> LA, america
	이름 : tom cruise
	나이 : 50
	키 : 170.5
	주소 : LA, america
*/
#include <stdio.h>

void main() {
	char name[100];
	int age;		// char age[100]; 요건 안 됨!
	double height;	// char height[100];
	char address[100];

	fputs("이름 입력 >> ", stdout);
	fgets(name, sizeof(name), stdin);	// gets(name);

	fputs("나이 입력 >> ", stdout);
	scanf_s("%d", &age);

	fputs(" 키 입력 >> ", stdout);
	scanf_s("%lf", &height);

	fflush(stdin);	// 입력 버퍼 비우기 (윈도우 전용)

	fputs("주소 입력 >> ", stdout);
	fgets(address, sizeof(address), stdin);		// gets(address);

	printf("이름 : %s \n", name);
	printf("나이 : %d \n", age);
	printf("키 : %g \n", height);
	printf("주소 : %s \n", address);
}