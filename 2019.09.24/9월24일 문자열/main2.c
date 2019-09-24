/*
	문제. 임의의 과목 3개를 저장하고,
	main 함수의 인수 전달 방식으로 과목을 하나 전달해서,
	전달한 과목이 저장된 과목에 있는지 여부 판단
	"있는 과목", "없는 과목"
*/
#include <stdio.h>
#include <string.h>

int main(int argc, char *argv[]) {

	char *subjects[3] = {"국어", "영어", "수학"};
	int i;
	int isExist = 0;	// 찾는 과목이 없다!

	if (argc != 2) {
		printf("잘못된 접근입니다. \n");
		return -1;
	}

	// 프롬프트/> Part6-문자열.exe 국어

	for (i = 0; i < 3; i++) {
		if ( !strcmp(argv[1], subjects[i]) ) {
			isExist = 1;	// 찾는 과목이 있다!
			break;			// 그만 찾자!
		}
	}

	if ( isExist ) {
		puts("있는 과목");
	} else {
		puts("없는 과목");
	}

	return 0;
}