/*
	문자열 입력 함수
	1. 콘솔 : gets(배열)
	2. 파일 : fgets(배열, 최대길이, 스트림)

	char* fgets(char* str, int maxCount, File* stream);
	
	1) 성공시 실제 읽어들인 str 리턴
	2) 실패시 NULL 리턴
*/
#include<stdio.h>

void main() {
	FILE* in = fopen("log.txt", "r");
	char* ptr;
	char str[5];
	if (in == NULL) {
		printf("파일 오픈 오류 \n");
		return;
	}
	while(1){
		ptr = fgets(str,sizeof(str),in);
		if( ptr == NULL ) {
			break;
		}
		printf("%s", str); // 	fputs(str, stdout); (O),  puts(str);  (X)  
														//puts는 자동으로 줄바꿈이 포함되서 되도록 사용하지 말것
	}
}