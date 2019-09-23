/*
문자열 배열
1) 사용 형식
char str[6];
char str[6]= " ";
char str[] = "Hello";
2) 문자열 배열은 저장된 문자에 수정이 가능한 변수이다!

문자열 포인터
1) 사용형식
char *str = "Hello";
2) 문자열 포인터는 저장된 문자의 수정이 불가능한 상수이다.
3) str[6]에 최대 글자 5글자이지?
  - 문자열의 종료를 NULL 문자를 통해서 알림! 
  - NULL 문자가 저장될 공간이 필요하기 때문에.  "실제문자열" + NULL 문자의 크기
  - 널문자 :  ' \0 ' 
  - 널문자는 자동으로 삽입됨.

*/

#include<stdio.h>
void main() {
	char str1[] = "Hello World";
	char *str2 = "World Hello";
	printf("문자열1 : %s \n",str1);  // printf("%s", 주소값);
	printf("문자열1 : %s \n",str2);
	// 문자열의 출력은 "주소" ~ "널문자" 까지.
	printf("%s \n", &str1[0]);
	printf("%s \n", &str1[1]);

	str1[5]='\0';
	printf("%s \n",str1);
	printf("%s \n",&str1[6]);
}

