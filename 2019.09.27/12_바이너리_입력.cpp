/*
	바이너리 모드 : rb, wb, ab
	이진데이터 그대로 입출력 : 사운드, 이미지, 동영상, 구조체 등

	바이너리 출력 함수

	size_t fwrite(const void* ptr, size_t size, size_t count, FILE* stream)

	size_t : 양수만 처리하는 int

	ptr : 입력된 데이터가 저장될 주소
	size : 입력 데이터의 크기
	count : 입력할 데이터의 개수
	stream : 입력 데이터가 전송될 스트림(파일 포인터)
*/
#include<stdio.h>

struct person {
	int age;
	char name[20];
};

void main(){
	FILE* in = fopen("person.bin","rb");
	person woman;

	if(in == NULL ) {
		printf("파일 오픈 에러 \n");
		return;
	}
	fread(&woman,sizeof(woman),1,in);

	printf("나이 : %d살, 이름 : %s \n", woman.age, woman.name);

	fclose(in);
}